package com.dicoding.javafundamental.collection.apps;

import com.dicoding.javafundamental.collection.uservalidation.CreateUserRequest;
import com.dicoding.javafundamental.collection.uservalidation.ValidationUtils;

public class ReflectionApps {

    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Kholish");
        request.setPassword("kosong");
        ValidationUtils.validationReflection(request);
    }
}
