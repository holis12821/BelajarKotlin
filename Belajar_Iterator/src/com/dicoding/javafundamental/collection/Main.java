package com.dicoding.javafundamental.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<President> presidents = new ArrayList<>();

        PresidentAdapter adapter = new PresidentAdapter(presidents);
        /*mengambil semua data*/
        presidents.addAll(PresidentData.getDataPresident());
        adapter.onBindViewHolder(0);
        adapter.onCreateViewHolder(null);
    }
}
