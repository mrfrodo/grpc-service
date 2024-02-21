package com.example.grpcservice.service;

import com.example.grpcservice.PersonServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PersonService extends PersonServiceGrpc.PersonServiceImplBase {
}
