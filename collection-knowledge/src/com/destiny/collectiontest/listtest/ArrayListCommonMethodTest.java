package com.destiny.collectiontest.listtest;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList常用的方法
 * 1.size()直接读取ArrayList中的变量值
 * 2.isEmpty() 通过判断size == 0
 * 3.contains()方法的实现还是依赖indexOf()方法
 * 4.indexOf(),先判断是否null 是的话 for循环遍历数组，否的话 for遍历数组，然后比较equals是否相等
 * 5.lastIndexOf 和indexOf的区别就是从后向前遍历
 * 6.toArray 直接使用Arrays.copy方法复制出来一个数组
 * 7.get 直接取数组中的值
 * 8.set 把当前数组中的覆盖且返回原来的旧值
 */
public class ArrayListCommonMethodTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        System.out.println("arrayList的大小:"+arrayList.size());
        System.out.println("-----------------------------------");
        System.out.println("arrayList是否为空:"+arrayList.isEmpty());
        System.out.println("-----------------------------------");
        //contains()方法的实现还是依赖indexOf()方法
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
        System.out.println("-----------------------------------");
        System.out.println("获取集合元素:"+arrayList.get(0));
        System.out.println("-----------------------------------");
        arrayList.set(0,"bb");
        System.out.println("替换集合中的元素:"+arrayList.get(0));
    }
}
