package com.dicoding.javafundamental.collection.parcelable.model;

import java.util.ArrayList;

public class AppDataPerson {

    public static void main(String[] args) {

        Person person = new Person();
        Person person2 = new Person();
        ArrayList<Person> list = new ArrayList<>();

        person.setName("Agus");
        person.setAge(12);
        person.setAddress("Jl. Melinjo 3");
        person.setCity("Jakarta");

        person2.setName("Mulan");
        person2.setAge(24);
        person2.setAddress("Jl. Kutubuk no 3");
        person2.setCity("Bandung");


        list.add(person);
        list.add(person2);


        for (Person people : list){
            System.out.println("Name : " + people.getName());
            System.out.println("Age : " + people.getAge());
            System.out.println("Address : " + people.getAddress());
            System.out.println("City : " + people.getCity());
            System.out.println("________________________________________________");
        }
    }

}
