package com.destiny.collectiontest.listtest;

import java.util.ArrayList;

/**
 *1. addAll(Collection<? extends E> c)
 * 直接把要加入的集合通过System.arraycopy方法复制到目标集合最后的
 *2.addAll(int index, Collection<? extends E> c)
 * 2.1 index后的元素移动到最右侧，然后要加入的集合在复制进来
 * 2.2. 比方法1又多了一次复制
 */
public class ArrayListAddAllTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("0");
        strings.add("1");
        strings.add("2");
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("3");
        strings1.add("4");
        boolean b = strings.addAll(strings1);
        if(b){
            for (String s:strings){
                System.out.println("输出:"+s);
            }
        }
        System.out.println("--------------------------------------------");
        //指定下标开始复制
        boolean b1 = strings.addAll(1, strings1);
        if(b1){
            for (String s:strings){
                System.out.println("输出:"+s);
            }
        }
    }
}
