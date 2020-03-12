package com.yx.entity;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author biyongjin
 * @create 2020-03-07 13:33
 */
public class TemplateTest {
    //prsf
    private static final int num=1;
    //psf
    public static final int num1=2;
    //psfi
    public static final int num2=3;
    //psfs
    public static final String nation ="china";
    // 模板一 psvm
    public static void main(String[] args) {
        //sout  soutp  soutm  soutv xxx.sout
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        String name ="nsad ";
        System.out.println(name);

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);

        //fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(1));

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //iter  加强for循环

        for (Object o : list) {
            System.out.println(o);
        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        // list.for   list的增强for循环
        for (Object o : list) {

        }
        //list.fori  list的一般循环
        for (int i = 0; i < list.size(); i++) {


        }
        // list.forr 倒叙的for循环
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
}
