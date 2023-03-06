package com.test.grpcexample.service;

import com.google.protobuf.ByteString;
import com.test.grpcexample.protoimpl.*;
import io.grpc.stub.StreamObserver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class FileService extends fileGrpc.fileImplBase {

    private static final Logger logger = Logger.getLogger(FileService.class.getName());

    @Override
    public void upload(UploadRequest request, StreamObserver<UploadResponse> responseObserver) {
        try {
            byte[] bytes = request.getFile().toByteArray();
            FileOutputStream outputStream = new FileOutputStream("uploaded.csv");
            outputStream.write(bytes);
            outputStream.close();
            logger.info("CSV file uploaded successfully!");
            UploadResponse response = UploadResponse.newBuilder().setMessage("CSV file uploaded successfully!").build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (IOException e) {
            logger.warning("Error: " + e.getMessage());
            responseObserver.onError(e);
        }
    }

    @Override
    public void download(DownloadRequest request, StreamObserver<DownloadResponse> responseObserver) {
        String fileName = request.getFilename();

        // hardcoded file which can be later on sent client
        Path path = Paths.get("C:\\Users\\HP\\Downloads\\students - Sheet1.csv");
        byte[] fileData;
        try {
            fileData = Files.readAllBytes(path);
        } catch (IOException e) {
            logger.info("exception occurred!!!");
            responseObserver.onError(e);
            return;
        }

        // Send the file data to the client in a stream of CsvResponse messages
        DownloadResponse.Builder builder = DownloadResponse.newBuilder();
        builder.setFile(ByteString.copyFrom(fileData));
        logger.info("CSV file downloaded successfully!");
        DownloadResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
