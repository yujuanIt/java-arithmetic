package cn.com.jake.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class twoSum {

    public static void main(String[] args) {
        int[] x = twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.stream(x).forEach(System.out::println);

    }

    /**
     * 时间复杂度为O(n)
     * for循环数组  用目标值 减去当前的值,获取到差值, 同时定义一个map(key 为值,value 为下标),根据差值从map中获取,如果存在,则直接返回当前下标以及map对应的value,如果不存在,将当前的值和下标存入map中
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        //定义一个返回的数组对象
        int index[] = new int[2];
        //用来存储位置和具体值的map
        HashMap<Integer, Integer> map = new HashMap<>();
        //遍历数组对象
        for (int i = 0; i < nums.length; i++) {
            //目标值减去当前值 获取差值
            int number = target - nums[i];
            //获取差值是否在当前map
            if (map.get(number) != null) {
                //在当前map 直接返回
                index[0] = map.get(number);
                index[1] = i;
                return index;
            }
            //不再map里 put到map中
            map.put(nums[i], i);

        }
        return index;
    }
}
