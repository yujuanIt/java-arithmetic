package cn.com.jake.leetcode;

import java.util.Stack;

/**
 * 【题目】在水中有许多鱼，可以认为这些鱼停放在 x 轴上。再给定两个数组 Size，Dir，Size[i] 表示第 i 条鱼的大小，Dir[i] 表示鱼的方向 （0 表示向左游，1 表示向右游）。这两个数组分别表示鱼的大小和游动的方向，并且两个数组的长度相等。鱼的行为符合以下几个条件:
 * <p>
 * 所有的鱼都同时开始游动，每次按照鱼的方向，都游动一个单位距离；
 * <p>
 * 当方向相对时，大鱼会吃掉小鱼；
 * <p>
 * 鱼的大小都不一样。
 * <p>
 * 输入：Size = [4, 2, 5, 3, 1], Dir = [1, 1, 0, 0, 0]
 * <p>
 * 输出：3
 * <p>
 * 请完成以下接口来计算还剩下几条鱼？
 */
public class EatFish {
    public static void main(String[] args) {

    }

    public int solution(int[] fishSize, int[] fishDirection) {
        int fishNumber = fishSize.length;
        if (fishNumber <= 1) {
            return fishNumber;
        }
        // 向左游 0
        int left = 0;
        // 向右游 1
        int right = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < fishNumber; i++) {
            //当前鱼的 方向 和 大小
            int currentFishDirection = fishDirection[i];
            int currentFishSize = fishSize[i];
            // 当前鱼是否被吃掉
            boolean hasEat = false;

            //如果栈不为空 且栈顶为右 当前为 左
            while (!stack.empty() && fishDirection[stack.peek()] == right && currentFishDirection == left) {
                //如果栈顶元素 大于当前的 则被吃掉
                if (fishSize[stack.peek()] > currentFishSize) {
                    hasEat = true;
                    break;
                }

                //如果当前鱼大于 栈顶的鱼  栈顶的鱼出栈
                stack.pop();

            }
            // 如果新来的鱼没有被吃掉 则入栈
            if (!hasEat) {
                stack.push(i);

            }
        }
        return stack.size();
    }
}
