package com.dicoding.javafundamental.collection.apps;

import com.dicoding.javafundamental.collection.company.Employee;
import com.dicoding.javafundamental.collection.company.Manager;
import com.dicoding.javafundamental.collection.company.VipePresident;

public class ManagerApps {

    public static void main(String[] args) {
        var employee = new Employee("Eko", "Bogor", 21);
        employee.sayHello("Dono");

        employee = new Manager("Dono", "Jakarta", 22);
        employee.sayHello("Joni");

        
        var manager = new Manager("Dodi", "Banda Aceh", 22, "Montoon");
        manager.sayHello("JOko");
        manager.Company();

        employee = new VipePresident("Joni", "Bandung", 22);
        employee.sayHello("Joko");


    }
}
