package cn.com.jake.sort;

import java.util.Arrays;

/**
 * @Classname TestMain
 * @Description TODO
 * @Date 19-2-14 下午4:04
 * @Created by yujuan
 */
public class TestMain {


    public static void main(String[] args) {
        int[] array = {21, 2, 33, 4, 55, 6, 77};
        System.out.println("原数组是：" + Arrays.toString(array));
        BubblingSort bubblingSort = new BubblingSort();
        int[] sort = bubblingSort.sort(array);
        bubblingSort.arrayToString(sort);
    }

}
