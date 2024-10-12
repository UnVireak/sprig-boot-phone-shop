package com.unvireak.javaSpringBoot.phoneShop.phoneShop.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApiException{

    // public ResourceNotFoundException(HttpStatus status, String message) {
    //     super(status, message);
    //     //TODO Auto-generated constructor stub
    // }
    public ResourceNotFoundException(String resourceName, Integer id) {
       
        super(HttpStatus.NOT_FOUND, String.format("%s with id = %d not found!", resourceName, id));

    }

}
