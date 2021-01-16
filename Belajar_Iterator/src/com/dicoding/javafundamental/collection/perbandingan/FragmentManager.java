package com.dicoding.javafundamental.collection.perbandingan;

public abstract class FragmentManager {

    public FragmentManager(){

    }

  public  Fragment findViewByTag(String tag){
        return new Fragment(tag);
  }

}
