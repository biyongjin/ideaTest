package com.yx.entity;

import java.util.HashMap;

/**
 * @author biyongjin
 * @create 2020-03-07 17:40
 */
public class Dugger {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("name","xiaohong");
        map.put("age","12");
        map.put("sex","女");
        System.out.println(map.get("age"));


        map.remove("name");
    }
}
