package com.destiny.collectiontest.listtest;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList相关知识点
 */
public class ArrayListTest {
    public static void main(String[] args) {
        try {
            List<String> arrayList = new ArrayList<>(10);
            for(int i=0;i<10;i++){
                arrayList.add("a"+i);
            }
            arrayList.add("a"+11);
            Field elementData = arrayList.getClass().getDeclaredField("elementData");
            elementData.setAccessible(true);
            Object[] o = (Object[])elementData.get(arrayList);
            System.out.println("剪切之前的值:"+o.length);
            System.out.println("----------------------");
            ((ArrayList<String>) arrayList).trimToSize();
            elementData.setAccessible(true);
            Object[] o1 = (Object[])elementData.get(arrayList);
            System.out.println("剪切之后的值:"+o1.length);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
