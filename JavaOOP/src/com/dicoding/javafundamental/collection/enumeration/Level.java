package com.dicoding.javafundamental.collection.enumeration;

public enum Level {
    /*Implement Constructor*/
    STANDART("Level Standart"),
    PREMIUM("Level Premium"),
    VIP("Level VIP");

    private String description;

   Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
