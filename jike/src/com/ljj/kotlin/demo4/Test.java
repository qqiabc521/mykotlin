package com.ljj.kotlin.demo4;

public class Test {

    public static void main(String[] args){
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("my test");
//            }
//        });

        Thread thread = new Thread(() -> {
                System.out.println("my test");
        });

        thread.start();

    }
}
