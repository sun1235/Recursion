package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(triangle(7));

    }

    public static int triangle (int i){

     if (i == 0) {
         return 0;
     }

    return i + triangle(--i);
    }
}
