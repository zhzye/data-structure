package com.zhzye;

public class O {
    /**
     * 时间复杂度是o(n)
     * n是data中元素的个数
     * 实际的算法应该是线性的，实际时间T = c1*n + c2
     * 忽略常数c1 c2
     * 都是o(n)，因为不同语言生成指令不一样，不同cpu执行效率也不一样
     * 所以我们要忽律常数
     *
     * @param data
     * @return
     */
    public int sum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}
