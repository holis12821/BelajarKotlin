package com.dicoding.javafundamental.collection.mathutils;

public class Application {
    private static final int PROCESSORS;

    /*Block Static*/
    static {
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

    public static int getPROCESSORS() {
        return PROCESSORS;
    }
}
