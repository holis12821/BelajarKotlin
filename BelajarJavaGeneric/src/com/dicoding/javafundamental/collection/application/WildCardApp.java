package com.dicoding.javafundamental.collection.application;

import com.dicoding.javafundamental.collection.generic.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        print(new MyData<>("eko"));
        print(new MyData<>(1));
    }

    public  static void print(MyData<?> data){

    }
}
