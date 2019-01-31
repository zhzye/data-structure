package com.zhzye.datastructure;

import com.zhzye.entity.Student;
import org.junit.Test;

/**
 * 实现数组结构
 * @author zhzye@gmail.com
 */
public class ArrayTest {
    @Test
    public void fetures() {
        Array<Integer> longArray = new Array<>();
        longArray.addLast(5);
        System.out.println(longArray);
        Array<Integer> shortArray = new Array<>(10);
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

    @Test
    public void studentArray() {
        Array<Student> studentArray = new Array<>();
        studentArray.addFirst(new Student("ha", 28));
        studentArray.addFirst(new Student("zhangsan", 30));
        System.out.println(studentArray);
    }
}
