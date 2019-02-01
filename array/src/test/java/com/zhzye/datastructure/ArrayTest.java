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
    public void resize() {
        Array<Integer> data = new Array<>(2);
        data.addLast(1);
        System.out.println(data);
        data.addLast(2);
        System.out.println(data);
        data.addLast(3);
        System.out.println(data);
        data.addLast(4);
        System.out.println(data);
        data.addLast(5);
        System.out.println(data);
        data.addLast(6);
        System.out.println(data);
        data.addLast(7);
        System.out.println(data);
        data.addLast(8);
        System.out.println(data);
        data.addLast(9);
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
        data.deleteLast();
        System.out.println(data);
    }

    @Test
    public void studentArray() {
        Array<Student> studentArray = new Array<>();
        studentArray.addFirst(new Student("ha", 28));
        studentArray.addFirst(new Student("zhangsan", 30));
        System.out.println(studentArray);
    }
}
