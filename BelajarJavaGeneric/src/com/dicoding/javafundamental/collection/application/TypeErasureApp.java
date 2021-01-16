package com.dicoding.javafundamental.collection.application;

import com.dicoding.javafundamental.collection.generic.MyData;

public class TypeErasureApp {

    public static void main(String[] args) {
        MyData myData = new MyData("eko");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
