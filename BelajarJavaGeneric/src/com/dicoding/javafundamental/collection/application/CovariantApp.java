package com.dicoding.javafundamental.collection.application;

import com.dicoding.javafundamental.collection.generic.MyData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<Object>integerMyData   = new MyData<>(1);
       process(integerMyData);


    }
    public static <T> void  process(MyData<? extends Object> myData){
        System.out.println(myData.getData());
        //myData.setData("eko"); error tdk boleh di di set karena berbahaya akan
        //mengubah seluruh data
        //myData.setData("");
        ArrayList<Person> list = new ArrayList<>();


    }

    public static ArrayList<Person> tampil(){
        Person person = new Person("holis", "addrees");
       ArrayList<Person> personArrayList = new ArrayList<>();
       personArrayList.add(person);

       return personArrayList;
    }
}
