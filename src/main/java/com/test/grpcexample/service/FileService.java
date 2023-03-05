package com.test.grpcexample.service;

import com.test.grpcexample.protoimpl.*;
import io.grpc.stub.StreamObserver;

import java.io.FileOutputStream;
import java.io.IOException;
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
        super.download(request, responseObserver);
    }
}
