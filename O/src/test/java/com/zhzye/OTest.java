package com.zhzye;

import org.junit.Test;

public class OTest {
    @Test
    public void sum() {
        O o = new O();
        int[] data = new int[10];
        data[0] = 10;
        data[1] = 20;
        data[3] = 70;
        System.out.println(o.sum(data));
    }
}
