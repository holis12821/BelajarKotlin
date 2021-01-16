package com.dicoding.javafundamental.collection;

import java.util.ArrayList;

public class PresidentAdapter {
    private ArrayList<President> presidents; /*Ini array list blm aktif*/
    /*Create Constructor*/
    public PresidentAdapter(ArrayList<President> presidents){
        this.presidents = presidents;
    }
    public PresidentViewHolder onCreateViewHolder(ListPresident itemView){
       return new PresidentViewHolder(itemView);
    }

    public void onBindViewHolder(int position){
        /*Awal mulai index dari 0*/
        President president = presidents.get(position);
        System.out.println("Nama President : " + president.getName());
        System.out.println("Panjang Array = " + presidents.size());
    }

    static class PresidentViewHolder extends ListPresident{
        public PresidentViewHolder(ListPresident itemView){
            super(itemView);
        }

    }
}
