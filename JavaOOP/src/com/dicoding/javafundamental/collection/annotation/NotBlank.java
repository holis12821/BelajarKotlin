package com.dicoding.javafundamental.collection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {

    /*Annotation here*/
    /*Default Field or Attribute*/
}
