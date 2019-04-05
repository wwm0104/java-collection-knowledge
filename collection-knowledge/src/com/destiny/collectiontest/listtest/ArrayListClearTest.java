package com.destiny.collectiontest.listtest;

import java.util.ArrayList;

/**
 * clear
 * for循环，把数组直接清空，size设置为0
 */
public class ArrayListClearTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ass");
        strings.add("ass1");
        strings.add("ass2");
        strings.add("ass3");
        System.out.println("清空前:"+strings.size());
        strings.clear();
        System.out.println("清空后:"+strings.size());
    }
}
