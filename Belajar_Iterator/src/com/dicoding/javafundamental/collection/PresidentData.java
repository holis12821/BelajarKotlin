package com.dicoding.javafundamental.collection;

import java.util.ArrayList;

public class PresidentData {

    private static String[] name = {"Soekarno, soeharto, Susilo Bambang Yudonono"};

    static ArrayList<President> getDataPresident(){
        ArrayList<President> list = new ArrayList<>();

      for (int position = 0; position < name.length; position++){
          President president = new President();
          president.setName(name[position]);
          list.add(president);
      }
      return list;
    }
}
