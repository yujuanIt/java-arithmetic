package cn.com.jake.sort;


/**
 * @Classname QuickSort
 * @Description TODO
 * @Date 19-2-14 下午3:26
 * @Created by yujuan
 */
public class QuickSort extends AbstractSort {

    @Override
    public int[] sort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    /**
     * 快速排序是算法中最快的算法，时间复杂度为：O(N*logN)
     * 但最差的情况，运行时间也会很慢
     * 快速排序的原理：
     * 一：划分方法
     * 使用左右扫描指针同时从左右两端进行扫描，若满足条件，一个++，一个--
     * 当连个子循环都停下来时交换数据，当两个指针相遇时，程序结束
     * 当外层循环结束时，把最后一个元素（枢纽）放到指定位置（leftPar处），
     * 因为此时两个指针相遇leftPar=rightPar，也即交换两元素位置swap(array,leftPar,right);
     * 二：划分方法结束后返回枢纽下标，也就是分界线的下标 ，然后递归调用枢纽的左边和右边
     *
     * @param array 数组
     * @param left  起始点
     * @param right 结束点
     * @return
     */
    public static int[] quickSort(int[] array, int left, int right) {
        // int left = 0;
        // int right = array.length - 1;
        if (left < right) {
            int pivot = array[right];//使用数组最后一个元素作为枢纽
            //这一步是分成左右两组：一组大，一组小，但是两组都无序
            int partition = partitionIn(array, left, right, pivot);
            //递归调用，使小的一组排好序
            quickSort(array, left, partition - 1);//递归 枢纽的左边
            //递归调用，使大的一组排好序
            quickSort(array, partition + 1, right);//递归枢纽的右边
        }
        return array;
    }

    /**
     * 划分方法
     *
     * @param array 数组
     * @param left  起始点
     * @param right 结束点
     * @param pivot 枢纽（默认为数组最后一个元素）
     * @return
     */
    private static int partitionIn(int[] array, int left, int right, int pivot) {
        int leftPar = left - 1;//左扫描指针
        int rightPar = right;//右扫描指针，排除数组最后一个元素
        while (true) {
            while (array[++leftPar] < pivot) ;//因为使用数组最后一个元素作为枢纽，不用担心下标越界
            while (rightPar > 0 && array[--rightPar] > pivot) ;//使用rightPar>0,防止下标越界
            if (leftPar >= rightPar)//当两个扫描指针相遇，程序结束
                break;
            else {
                swap(array, leftPar, rightPar);//否则交换
            }
        }
        swap(array, leftPar, right);
        return leftPar;
    }

    /**
     * 交换两个元素
     *
     * @param one
     * @param another
     */
    private static void swap(int[] array, int one, int another) {
        int temp = array[one];
        array[one] = array[another];
        array[another] = temp;
    }


}
