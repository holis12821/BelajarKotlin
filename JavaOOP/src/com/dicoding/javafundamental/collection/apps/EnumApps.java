package com.dicoding.javafundamental.collection.apps;

import com.dicoding.javafundamental.collection.customer.Customer;
import com.dicoding.javafundamental.collection.enumeration.Level;

public class EnumApps {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Nurholis");
        customer.setLevel(Level.PREMIUM);

        Customer customer2 = new Customer();
        customer2.setName("Joko");
        customer2.setLevel(Level.VIP);

        System.out.println( "Nama Customer : " +customer.getName());
        System.out.println( "Level Member  : " + customer.getLevel() );

        System.out.println("Nama Customer : " + customer2.getName());
        System.out.println("Level Member : " + customer2.getLevel());
        System.out.println("Description : " + customer2.getLevel().getDescription());

        String levelName = Level.STANDART.name();
        System.out.println(levelName);

        Level level = Level.valueOf("VIP");
        System.out.println(level);

        System.out.println("Member pada Customer : ");
        for (var value: Level.values()) {
            System.out.println("Level Member : " + value);
        }

    }
}
