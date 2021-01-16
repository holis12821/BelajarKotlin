package com.dicoding.javafundamental.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> ls = new ArrayList<>();
        ls.add("String1");
        ls.add("String2");

        
    }

    private static void print(Collection<Object> collection) {
        for (Object o: collection) {
            System.out.println(o);
        }
    }
}
