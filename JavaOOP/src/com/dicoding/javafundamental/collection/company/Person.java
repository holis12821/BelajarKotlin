package com.dicoding.javafundamental.collection.company;

public class Person {
  private String name;
  private String address;

    final String country = "indonesia";

    /*Overload Constructor*/
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public Person(String name){
       this(name, null);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    /*Create Constructor Kosong*/
    Person(){
        this(null);
    }



    void satHello(String name){
        System.out.println("Hello" +  name+ ", My name is " + this.name);
    }
}
