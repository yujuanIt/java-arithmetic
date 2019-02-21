package cn.com.jake.sort;

import java.util.Arrays;

/**
 * @Classname AbstractSort
 * @Description TODO
 * @Date 19-2-14 下午3:57
 * @Created by yujuan
 */
public abstract class AbstractSort {

    public abstract int[] sort(int array[]);

    public void arrayToString(int[] arr) {
        Arrays.toString(arr);
    }

}
