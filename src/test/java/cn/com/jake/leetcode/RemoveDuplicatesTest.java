package cn.com.jake.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    @Test
    public void test() {
        int[] nums = new int[]{1, 1, 2};
        int result = RemoveDuplicates.removeDuplicates(nums);
        Assert.assertArrayEquals(nums, new int[]{1, 2, 2});
        Assert.assertEquals(result, 2);

    }

    @Test
    public void test1() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = RemoveDuplicates.removeDuplicates(nums);
        Assert.assertArrayEquals(nums, new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4});
        Assert.assertEquals(result, 5);

    }

}