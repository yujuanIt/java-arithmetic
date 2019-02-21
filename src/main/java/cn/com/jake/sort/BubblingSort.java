package cn.com.jake.sort;


/**
 * @Classname BubblingSort
 * @Description 冒泡排序，每次对比相邻两项元素的大小，不符合顺序则交换
 * @Date 19-2-1 下午1:53
 * @Created by yujuan
 */
public class BubblingSort extends AbstractSort {
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}

