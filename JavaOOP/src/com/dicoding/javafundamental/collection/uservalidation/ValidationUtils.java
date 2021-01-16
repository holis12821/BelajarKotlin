package com.dicoding.javafundamental.collection.uservalidation;

import com.dicoding.javafundamental.collection.annotation.NotBlank;

import java.lang.reflect.Field;

public class ValidationUtils {
    public static void validationReflection(Object o){ /*Object o = new CreateUserRequest();*/
        Class aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field: fields) {
            /*Terkadang kita tidak tahu field itu private atau bukan*/
            /*Jika private maka tidak bisa diakses*/
            /*Mengecek apakah field apakah private atau bkn jika iya dipaksa untuk mengakses Field private tersebut */
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null){
                /*Validate*/
                try{
                    String value = (String) field.get(o);
                    if (value ==  null || value.isBlank()){
                        System.out.println("Field " + field.getName() + " is Blank");
                    }
                } catch (IllegalAccessException e){
                    System.out.println("Tidak bisa mengakses field" + field.getName());
                }
            }
        }
    }
}
