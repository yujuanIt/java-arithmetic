package cn.com.jake.leetcode;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1：
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长>度后面的元素。
 * <p>
 * <p>
 * 示例 2：
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 链接：https://juejin.cn/post/6997407482779795492
 *
 * @author yujuan
 */
public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return length;
        }
        int slow = 1;
        for (int fast = 1; fast < length; fast++) {
            if (nums[fast - 1] < nums[fast]) {
                // 如果快指针 比 前一个 大 说明 新节点， slow节点进行移动
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
