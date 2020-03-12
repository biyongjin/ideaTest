package com.yx.entity;

import java.util.ArrayList;
import java.util.Date;

public class Test {


    private static final int intial_sise = 12;

    public static void main(String[] args){System.out.println("hello" );System.out.println("hello" );


        test1();

        System.out.println("hello" );

        Date d = new Date();
        ArrayList list1 = new ArrayList();
        //list1.add(1,2);
        m1();
        String name="你好";
        try {

            int b= name.getBytes("utf-8").length;
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }


//        try {
//            FileInputStream IF=new FileInputStream("1.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }

    private static void test1() {
        System.out.println("hello" );
//        System.out.println("hello" );

        System.out.println("hello" );
        System.out.println("hello");
        System.out.println("hello" );
        System.out.println("hello" );
    }


    public  static void m1(){}
}
