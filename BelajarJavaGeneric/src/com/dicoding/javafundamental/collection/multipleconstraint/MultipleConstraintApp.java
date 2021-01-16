package com.dicoding.javafundamental.collection.multipleconstraint;

public class MultipleConstraintApp {

    public static void main(String[] args) {
        //Data<Manager> data = new Data<>(new Manager("kholish")); //karena manager tdk implementai interface CanSayHello
        //data.setHello("kholish");
        Data<VipePresident> data = new Data<>(new VipePresident("kholish"));
        Object value = data.getData();
        System.out.println(value);
    }

    public interface  CanSayHello{
        void sayHello(String name);
    }

    public static abstract class Employee{
            private String name;

            public Employee(String name){
                this.name = name;
            }
    }

    public static class Manager extends Employee {

        public Manager(String name){
            super(name);
        }
    }
    public static class VipePresident extends Employee implements CanSayHello{

        public VipePresident(String name){
            super(name);
        }
        @Override
        public void sayHello(String name) {
            System.out.println("Hello : " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setHello(String name){
            this.data.sayHello(name);
        }

    }

}
