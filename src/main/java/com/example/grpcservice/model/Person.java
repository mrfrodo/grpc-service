package com.example.grpcservice.model;

import org.springframework.data.annotation.Id;

public record Person(@Id Integer id, String name ) {
}
