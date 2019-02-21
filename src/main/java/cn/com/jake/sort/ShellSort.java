package cn.com.jake.sort;

/**
 * @Classname shellSort
 * @Description TODO
 * @Date 19-2-14 下午3:53
 * @Created by yujuan
 */
public class ShellSort extends AbstractSort {
    /**
     * 希尔排序顾名思义就是因为计算机科学家Donald L.Shell而得名
     * 他在1959年创造了该算法，希尔排序是基于插入排序的，
     * 但是增加了一个新特性 （n减增量），不断减少增量的间隔，最后使得增量为1
     * 大大提高了插入排序的执行效率，希尔排序比其它简单排序算法要快，它在最坏的情况下，执行
     * 效率也不会和平均效率相差很多，但是像快速排序虽然执行效率高，但最坏的时候会效率会很低
     * 理解：所谓创造就是头脑中原有的知识的重新排列组合，所以学得越多，你创造的可能性就越大！
     * 时间复杂度为O(N*(logN)^2)
     * <p>
     * 希尔排序的原理：
     * 在插入排序的基础上通过增量不断进行分组、插入排序的过程
     *
     * @param array
     */
    @Override
    public int[] sort(int[] array) {
        // Donald Ervin Knuth 唐纳德·欧文·克努斯（Knuth发音为/knuːθ/）
        int inner/*内部循环变量*/, outer/*外部循环变量*/, temp, h = 1;/*Knuth增量*/
        //增量的选择:使用Knuth增量间隔序列 h = h * 3 + 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {//outer会变化
                inner = outer;
                temp = array[outer];
                for (; inner - h >= 0 && array[inner - h] >= temp; inner -= h) {//inner会变化
                    array[inner] = array[inner - h];//要交换的两个元素相差一个增量
                }
                //inner 已经变化
                array[inner] = temp;
            }
            //增量倒推公式： h = (h - 1) / 3;
            h = (h - 1) / 3;
        }
        return array;
    }
}
