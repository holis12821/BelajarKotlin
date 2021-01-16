package com.dicoding.javafundamental.collection.innerclass;

import javax.swing.text.View;

public class ClassOuther {
    private String name;

    public String getName(){
        return this.name;
    }

    public ClassInner onCreateViewHolder(ClassInner holder){
        return new ClassInner(null);
    }

   public static class ClassInner extends ViewHolder{
        private String name;
        private String address;
        public ClassInner(View itemView) {
            super(itemView);
        }
    }
}
