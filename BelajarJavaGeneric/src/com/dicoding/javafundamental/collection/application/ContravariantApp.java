package com.dicoding.javafundamental.collection.application;

import com.dicoding.javafundamental.collection.generic.MyData;

public class ContravariantApp {

    public static void main(String[] args) {
        MyData<Integer> objectMyData = new MyData<>(1);

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public  static <T> void process(MyData<? super T> myData){
        Object o = new Object();
        String value = (String) myData.getData();


    }
}
