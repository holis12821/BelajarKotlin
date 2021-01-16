package com.dicoding.javafundamental.collection.cekcondition;

public class Conditonal {

    public static void main(String[] args) {
        Conditonal conditonal = new Conditonal();
        if (conditonal.Cek() || conditonal.Cek2()){
            System.out.println(conditonal.Cek() + " Or " + conditonal.Cek2());
        }
    }

    boolean Cek (){
        int i = 0;
        int j = 10;

        if (i < j){
            return false;
        }
        return true;
    }

    boolean Cek2 (){
        int i = 0;
        int j = 10;

        if (i < j){
            return true;
        }
        return false;
    }
}
