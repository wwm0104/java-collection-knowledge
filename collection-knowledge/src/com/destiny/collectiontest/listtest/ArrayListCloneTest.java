package com.destiny.collectiontest.listtest;

import com.destiny.collectiontest.pojo.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * clone 方法
 * 该方法属于浅拷贝
 */
public class ArrayListCloneTest {
    public static void main(String[] args) {
        List<Page> pages = new ArrayList<>();
        Page page = new Page();
        page.setCountTotal(100);
        pages.add(page);
        System.out.println("数组内容:"+pages.get(0).getCountTotal());
        System.out.println("---------clone之前-------------");
        List<Page>  clone = (ArrayList<Page>)((ArrayList<Page>) pages).clone();
        System.out.println("clone 之后内容:"+clone.get(0).getCountTotal());
        System.out.println("---------修改值为101-------------");
        page.setCountTotal(101);
        System.out.println("---------再次打印内容-------------");
        System.out.println("clone内容:"+clone.get(0).getCountTotal());
        System.out.println("原始内容:"+clone.get(0).getCountTotal());
    }
}
