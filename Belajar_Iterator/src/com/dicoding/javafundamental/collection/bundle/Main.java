package com.dicoding.javafundamental.collection.bundle;

import com.dicoding.javafundamental.collection.perbandingan.Fragment;

public class Main {

    public static void main(String[] args) {


    Main main = new Main();
    Fragment fragment = main.findViewByTag(Data.class.getSimpleName());
    Data data = new Data();

        /*if (fragment == data){
            System.out.println("fragment instanceof Data" + data.toString());
        }*/

        if (fragment.equals(data)){
            System.out.println("Sama");
        }

    }

    Fragment findViewByTag(String tag){
        return new Fragment(tag);
    }

    @Override
    public boolean equals(Object obj) {
        Fragment fragment = new Fragment();


    }
}
