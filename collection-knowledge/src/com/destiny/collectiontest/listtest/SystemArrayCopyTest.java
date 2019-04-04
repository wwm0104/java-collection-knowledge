package com.destiny.collectiontest.listtest;

/**
 * 数组拷贝
 * System.arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);
 * 含义:从 srcPos的未知开始复制对象src到数组dest中且dest的起始位置是destPos,长度是length
 */
public class SystemArrayCopyTest {
    public static void main(String[] args) {
        String[] strings = {"0","1","2"};

        String[] object = new String[10];

        System.arraycopy(strings,1,object,3,strings.length-1);
        for(String s:object){
            System.out.println("输出:"+s);
        }
    }
}
