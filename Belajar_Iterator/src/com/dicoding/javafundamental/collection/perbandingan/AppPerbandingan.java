package com.dicoding.javafundamental.collection.perbandingan;

public class AppPerbandingan {
    public static void main(String[] args) {

        Fragment fragment = new DetailFragment();

        Fragment fragment1 = new Fragment();
        DetailFragment detailFragment = new DetailFragment();

        if (fragment1 instanceof DetailFragment){
            System.out.println("Fragment merupakan instance dari DetailFragment");
        }
    }

}
