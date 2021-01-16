package com.dicoding.javafundamental.collection.perbandingan;

import javax.swing.text.View;

public class Fragment {


    private String tag;

    private static FragmentManager fragmentManager;

    public Fragment(){

    }

    public Fragment(String tag){
        this.tag = tag;
    }

    public FragmentManager getFragmentManager(){
        return fragmentManager;
    }


    protected View onCreateView(){
        return onCreateView();
    }

}
