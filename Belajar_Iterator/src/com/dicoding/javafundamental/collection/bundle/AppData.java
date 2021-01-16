package com.dicoding.javafundamental.collection.bundle;

import java.util.HashMap;

public class AppData {

    public static void main(String[] args) {
      Data data = new Data();
      HashMap<String, String> hashMap = new HashMap<>();
      data.data(hashMap);
        System.out.println(hashMap.get("key"));
        System.out.println(hashMap.get("value"));
    }


}
