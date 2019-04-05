package com.destiny.collectiontest.listtest;

import java.util.ArrayList;

/**
 * ArrayList add 方法
 * 1.add(E e) 直接数组最后增加元素
 * 2.add(int index, E element)  从index开始copy index到size-1的元素,然后把数组index的位置留给新的值，并且size+1
 */
public class ArrayListAddTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("直接在数组最后增加元素:"+strings.add("0"));
        strings.add("1");
        strings.add("2");
        strings.add(1,"2.1");//移动数组,在增加元素 使用的是System.arraycopy()方法
        for(String s:strings){
            System.out.println("输出:"+s);
        }
    }
}
