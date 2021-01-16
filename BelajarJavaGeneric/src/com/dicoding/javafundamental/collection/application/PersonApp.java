package com.dicoding.javafundamental.collection.application;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Eko", "Indonesia"),
                new Person("Joko", "bandung"),
                new Person("Adit", "Depok")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }

}
