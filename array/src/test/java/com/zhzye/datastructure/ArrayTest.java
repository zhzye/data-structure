package com.zhzye.datastructure;

import org.junit.Test;

/**
 * 实现数组结构
 * @author zhzye@gmail.com
 */
public class ArrayTest {
    @Test
    public void fetures() {
        Array longArray = new Array();
        longArray.addLast(5);
        System.out.println(longArray);
        Array shortArray = new Array(10);
        shortArray.addLast(1);
        shortArray.addLast(2);
        shortArray.addLast(3);
        shortArray.addLast(4);
        System.out.println(shortArray);
        shortArray.addAtIndex(0, 100);
        shortArray.addAtIndex(4, 200);
        System.out.println(shortArray);
        shortArray.deleteAtIndex(4);
        shortArray.deleteAtIndex(0);
        System.out.println(shortArray);
    }
}
