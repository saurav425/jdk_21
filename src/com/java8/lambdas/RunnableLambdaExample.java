package com.java8.lambdas;

import static java.lang.System.out;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
        Old Way
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                out.println("Inside Runnable");
            }
        };

        new Thread(runnable).start();

        /*
        Java 8 Lambda Syntax
         */

        Runnable runnable1 = ()->out.println("Inside java8 Runnable");
        new Thread(runnable1).start();
        new Thread(()->out.println("Another way Java8")).start();
    }
}
