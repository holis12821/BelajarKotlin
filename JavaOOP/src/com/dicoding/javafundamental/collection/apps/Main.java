package com.dicoding.javafundamental.collection.apps;

import com.dicoding.javafundamental.collection.company.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var person2 = new Person("Joko", "Jakut");
        System.out.println(person2.getName());
        System.out.println(person2.getAddress());

        var person = new Person("holis");
        System.out.println(person.getName());
    }
}
