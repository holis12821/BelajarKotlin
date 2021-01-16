package com.dicoding.javafundamental.collection.generic;

import java.util.ArrayList;
import java.util.Collection;

public class BelajarCovariant {

    private static <T>  void arrayToCollection(T[] a, Collection<T> c){
        for (T o : a){
            c.add(o);
        }
    }

    private static <T> void arrayToCollection2( T[] a, Collection<T> /*Collection of unknown*/ c) {
        for (T o : a) {
            c.add(o);
        }

    }

    static void print(Collection<?> col){
        for (Object o: col ) {
            System.out.println(o);
        }
    }


    public static void main(String[] args) {

        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();

        arrayToCollection2(oa,co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<>();

        Number[] nu = new Integer[10];
        Collection<Integer> integers= new ArrayList<>();

        //T Inferred to be String
        




    }

}
