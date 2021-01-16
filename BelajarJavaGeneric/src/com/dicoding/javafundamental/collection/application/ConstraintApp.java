package com.dicoding.javafundamental.collection.application;

public class ConstraintApp {

    public static void main(String[] args) {
        NumberData<Integer> integerNumber = new NumberData<>(1);
    }

    static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
