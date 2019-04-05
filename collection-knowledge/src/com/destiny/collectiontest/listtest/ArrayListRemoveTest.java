package com.destiny.collectiontest.listtest;

import java.util.ArrayList;

/**
 * remove方法
 * 同样是需要移动数组来完成删除操作
 * 1.移动数组,还是使用的System.arrayCopy 方法
 * 2.要对System.arrayCopy好好的理解才能明白remove方法的含义
 */
public class ArrayListRemoveTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("s1");
        strings.add("s2");
        strings.add("s3");
        String remove = strings.remove(1);
        //把index = 1的以后的元素向前移动，空出来的值 ==null,就达到删除元素的目的了
        System.out.println("移除之后的大小:"+strings.size());
    }
}
