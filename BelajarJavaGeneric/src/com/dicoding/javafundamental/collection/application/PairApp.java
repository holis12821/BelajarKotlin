package com.dicoding.javafundamental.collection.application;

import com.dicoding.javafundamental.collection.generic.Pair;

public class PairApp {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("eko", 10 );
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
