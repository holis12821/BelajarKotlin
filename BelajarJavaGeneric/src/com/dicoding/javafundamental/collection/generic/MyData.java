package com.dicoding.javafundamental.collection.generic;

public class MyData <T> {

    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public MyData() {
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
