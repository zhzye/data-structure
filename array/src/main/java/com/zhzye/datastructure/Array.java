package com.zhzye.datastructure;

import java.util.Arrays;

/**
 * 实现数组结构
 * @author zhzye@gmail.com
 */
public class Array {
    /**
     * 默认容量
     */
    private Integer DEFAULT_CAPACITY = 100;

    /**
     * 实际元素数量
     */
    private Integer size;

    /**
     * 静态数组，用来内存操作
     */
    private int[] data;

    /**
     * 默认容量初始化
     */
    public Array() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * 设定容量初始化
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 实际长度
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 容量
     * @return
     */
    public Integer getCapacity() {
        return data.length;
    }

    /**
     * 是否为空
     * @return
     */
    public Boolean isEmpty() {
        return size == 0 ? true:false;
    }

    /**
     * 尾部追加元素
     * @param element
     */
    public void addLast(Integer element) {
        data[size] = element;
        size++;
    }

    @Override
    public String toString() {
        return "com.zhzye.datastructure.Array{" +
                "capacity=" + data.length +
                ", size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
