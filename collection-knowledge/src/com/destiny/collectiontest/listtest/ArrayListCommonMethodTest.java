package com.destiny.collectiontest.listtest;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList常用的方法
 */
public class ArrayListCommonMethodTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        System.out.println("arrayList的大小:"+arrayList.size());
        System.out.println("-----------------------------------");
        System.out.println("arrayList是否为空:"+arrayList.isEmpty());
        System.out.println("-----------------------------------");
        System.out.println("arrayList是否包含某个元素:"+arrayList.contains("aa"));
        System.out.println("-----------------------------------");
        System.out.println("arrayList中该元素第一次出现的下标:"+arrayList.indexOf("aa"));
        System.out.println("-----------------------------------");
        System.out.println("arrayList中该元素最后次出现的下标:"+arrayList.lastIndexOf("aa"));
        arrayList.add("aa");
        System.out.println("-----------------------------------");
        System.out.println("转换为数组:"+arrayList.toArray()[0]);
        System.out.println("-----------------------------------");
        String[] strings = arrayList.toArray(new String[2]);
        System.out.println("转换为数组:"+strings[0]);

    }
}
