package com.dicoding.javafundamental.collection.exceptionapps;

public class ExceptionApps {

    public static void main(String[] args) throws Throwable {

      try {
          sampleError();
      } catch (RuntimeException e){
          e.printStackTrace();
      }
    }


    public static void sampleError() throws Throwable {
        try {
            String[] name = {"Nur", "Holis"
            };

            System.out.println("name : " + name[1]);
        }catch (Throwable throwable){
          throw   new Throwable(throwable);
        }

    }
}
