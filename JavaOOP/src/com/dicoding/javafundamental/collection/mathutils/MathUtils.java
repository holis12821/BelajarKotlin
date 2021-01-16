package com.dicoding.javafundamental.collection.mathutils;

public class MathUtils {

    public static int sum(int ... values){
        int total = 0; /*Initialize*/
        for (var value : values) {
            total += value; /*total = total + value*/
        }
        return total;
    }
}
