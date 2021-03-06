package com.zhzye.datastructure;

import java.util.Arrays;

/**
 * 实现数组结构
 * @author zhzye@gmail.com
 */
public class Array<E> {
    /**
     * 默认容量
     */
    private final Integer DEFAULT_CAPACITY = 100;

    /**
     * 动态数组扩容因子
     */
    private final Integer CAPACITY_RESIZE = 2;

    /**
     * 实际元素数量
     */
    private Integer size;

    /**
     * 静态数组，用来内存操作
     */
    private E[] data;

    /**
     * 默认容量初始化
     */
    public Array() {
        data = (E[])new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * 设定容量初始化
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[])new Object[capacity];
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
     * 首部追加元素
     * @param element
     */
    public void addFirst(E element) {
        addAtIndex(0, element);
    }

    /**
     * 尾部追加元素
     * @param element
     */
    public void addLast(E element) {
        addAtIndex(size, element);
    }

    /**
     * 查询某个位置元素
     * @param index
     */
    public E queryAtIndex(Integer index) {
        return data[index];
    }

    /**
     * 更新某个位置元素
     * @param index
     * @param element
     */
    public void updateAtIndex(Integer index, E element) {
        data[index] = element;
    }

    /**
     * 查找元素
     * @param element
     * @return
     */
    public Integer findElement(E element) {
        Integer ret = -1;
        for (int i = 0; i < size; i++) {
            if (element.equals(data[i])) {
                ret = i;
                break;
            }
        }
        return ret;
    }

    /**
     * 是否存在某个元素
     * @param element
     * @return
     */
    public Boolean contains(E element) {
        if (findElement(element) != -1) {
            return true;
        }
        return false;
    }

    /**
     * 删除指定位置元素
     * @param index
     */
    public void deleteAtIndex(Integer index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        if (size <= (data.length / (CAPACITY_RESIZE * 2))) {
            resize(size);
        }
        size--;
    }

    /**
     * 删除最后一个
     */
    public void deleteLast() {
        deleteAtIndex(size - 1);
    }

    /**
     * 在index插入
     * @param index
     * @param element
     */
    public void addAtIndex(Integer index, E element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        if (size == data.length) {
            resize(data.length * CAPACITY_RESIZE);
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = element;
        size++;
    }

    @Override
    public String toString() {
        StringBuffer ret = new StringBuffer();
        ret.append(String.format("size:%d,capacity:%d ", size, getCapacity()));
        ret.append(". data = ");
        for (int i = 0;i < size; i++) {
            ret.append(data[i] + " ");
        }
        return ret.toString();
    }

    /**
     * 动态扩容
     * @param newCapacity
     */
    public void resize(Integer newCapacity) {
        if (newCapacity != 0) {
            E[] newData = (E[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }
}
