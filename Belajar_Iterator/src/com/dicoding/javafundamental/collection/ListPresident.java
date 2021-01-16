package com.dicoding.javafundamental.collection;



public abstract class ListPresident {
    private ListPresident itemView;

    public ListPresident(ListPresident itemView){
        if (itemView == null){
            System.out.println("Error!!");
        }
        this.itemView = itemView;
    }
}
