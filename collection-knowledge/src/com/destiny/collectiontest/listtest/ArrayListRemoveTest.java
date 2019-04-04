package com.destiny.collectiontest.listtest;

import java.util.ArrayList;

/**
 * remove方法
 * 同样是需要移动数组来完成删除操作
 * 1.移动数组,还是使用的System.arrayCopy 方法
 */
public class ArrayListRemoveTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("s1");
        strings.add("s2");
        strings.add("s3");
        String remove = strings.remove(2);
        System.out.println("移除之后的大小:"+strings.size());
    }
}
