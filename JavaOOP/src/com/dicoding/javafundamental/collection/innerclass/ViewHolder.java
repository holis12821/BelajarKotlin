package com.dicoding.javafundamental.collection.innerclass;

import javax.swing.text.View;

public abstract class ViewHolder {
    public ViewHolder(View itemView){
        if (itemView == null){
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
