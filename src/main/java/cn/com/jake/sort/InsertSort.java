package cn.com.jake.sort;

import java.util.Arrays;

/**
 * @Classname InsertSort
 * @Description 每次 将一个待排序的记录，按其关键字大小插入到前面的已经排好序的子序列中的适当位置，真到全部记录插入完成为止
 * @Date 19-2-1 下午2:02
 * @Created by yujuan
 */
public class InsertSort extends AbstractSort {
    /**
     * 直接插入排序原理：
     * 给定的一组记录，将其分为两个序列组，一个为有序序列(按照顺序从小到大或者从大到小)，
     * 一个为无序序列，初始时，将记录中的第一个数当成有序序列组中的一个数据，
     * 剩下其他所有数都当做是无序序列组中的数据。然后从无序序列组中的数据中(也就是从记录中的第二个数据开始)
     * 依次与有序序列中的记录进行比较，然后插入到有序序列组中合适的位置，
     * 直到无序序列组中的最后一个数据插入到有序序列组中为止。
     * [21], 2, 33, 4, 55, 6, 77
     * 无序数组中的第一个元素同有序数组中的最后一个元素(即最大值，也即无序数组第一个元素的前一个元素)比较，
     * 比最大值还大，不执行操作,比最大值小则继续比较
     * 时间复杂度为：O(N^2)
     *
     * @param array
     * @return
     */
    @Override
    public int[] sort(int[] array) {
        //temp：记录较小值，将j提取到for循环外
        int j, temp;
        //循环无序数组
        for (int i = 1; i < array.length - 1; i++) {//[2, 33, 4, 55, 6, 77]
            if (array[i - 1] > array[i]) {//比最大值还大，不执行操作,比最大值小则继续比较
                temp = array[i];//temp：记录较小值
                //倒序循环有序数组
                for (j = i - 1; j >= 0 && array[j] > temp; j--) {//[21]
                    array[j + 1] = array[j];//将大的值往后移动
                }
                //内层循环结束，因为j--的原因，j 有可能为-1
                array[j + 1] = temp;
            }
            System.out.println("循环第" + i + "次：" + Arrays.toString(array));
        }
        return array;
    }
}
