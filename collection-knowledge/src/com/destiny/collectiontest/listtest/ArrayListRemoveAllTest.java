package com.destiny.collectiontest.listtest;

import java.util.ArrayList;

/**
 * removeAll
 * 1. 先把重复的元素覆盖掉
 *  for (; r < size; r++)
 *                 if (c.contains(elementData[r]) == complement)
 *                     elementData[w++] = elementData[r];  //把重复的元素覆盖
 * 2.然后在copy数组完成移除操作
 *             if (r != size) {
 *                 System.arraycopy(elementData, r,
 *                                  elementData, w,
 *                                  size - r);
 *                 w += size - r;
 *             }
 *             if (w != size) {
 *                 for (int i = w; i < size; i++)
 *                     elementData[i] = null;
 *                 modCount += size - w;
 *                 size = w;
 *                 modified = true;
 *             }
 */
public class ArrayListRemoveAllTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("0");
        strings.add("1");
        strings.add("2");
        strings.add("3");

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("1");
        strings1.add("2");

        strings.removeAll(strings1);
        for(String s:strings){
            System.out.println("输出:"+s);
        }
    }
}
