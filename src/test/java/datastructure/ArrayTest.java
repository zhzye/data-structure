package datastructure;

import com.zhzye.datastructure.Array;
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
        System.out.println(shortArray);
    }
}
