package cn.com.jake.sort;

/**
 * @Classname InsertSort
 * @Description 选择排序 每次从无序区找出最小的元素，跟无序区的第一个元素交换
 * @Date 19-2-1 下午2:02
 * @Created by yujuan
 */
public class SelectSort extends AbstractSort {
    /**
     * 选择排序原理：挨个比较
     * 外层 循环长度-1次，内层循环每次从第二个开始
     * 将外层循环中的值挨个与内层循环中的元素作比较
     * 时间复杂度为：O(N^2)
     *
     * @param array
     * @return
     */
    @Override
    public int[] sort(int[] array) {
        //根据原理分析，使用两层循环即可实现
        for (int i = 0; i < array.length - 1; i++) {//第一层
            for (int j = i + 1; j < array.length; j++) {    //第二层
                if (array[i] > array[j]) {    //数据互换。将小的放前面
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }
}
