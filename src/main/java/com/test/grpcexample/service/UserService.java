package com.test.grpcexample.service;

import com.test.grpcexample.protoimpl.APIResponse;
import com.test.grpcexample.protoimpl.Empty;
import com.test.grpcexample.protoimpl.LoginRequest;
import com.test.grpcexample.protoimpl.userGrpc;
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {

    @Override
    public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
        System.out.println("Inside login!!");
        String name = request.getUsername();
        String password = request.getPassword();
        APIResponse.Builder response  = APIResponse.newBuilder();
        if(name.equals(password)){
            // return success message
            response.setResponseCode(0).setResponseMessage("SUCCESS");
        }else{
            // return failure message
            response.setResponseCode(100).setResponseMessage("INVALID CREDENTIALS");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
        System.out.println("Inside logout!!");
    }
}
