package com.test.grpcexample;


import com.test.grpcexample.service.FileService;
import com.test.grpcexample.service.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcExampleApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("Starting Server!");
		Server server = ServerBuilder.forPort(9090)
				//.addService(new UserService())
				.addService(new FileService())
				.build();

		server.start();

		System.out.println("Server has been Started at : "+server.getPort());

		server.awaitTermination();
	}

}
