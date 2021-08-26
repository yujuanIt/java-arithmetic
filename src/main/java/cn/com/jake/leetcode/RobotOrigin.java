package cn.com.jake.leetcode;

/**
 * 657
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在(0, 0) 处结束。
 * <p>
 * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有R（右），L（左），U（上）和 D（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 * <p>
 * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: "UD"
 * 输出: true
 * 解释：机器人向上移动一次，然后向下移动一次。所有动作都具有相同的幅度，因此它最终回到它开始的原点。因此，我们返回 true。
 * 示例 2:
 * <p>
 * 输入: "LL"
 * 输出: false
 * 解释：机器人向左移动两次。它最终位于原点的左侧，距原点有两次 “移动” 的距离。我们返回 false，因为它在移动结束时没有返回原点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/robot-return-to-origin
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RobotOrigin {
    /**
     * 解题思路 定义两个值
     *      leftAndRight: 左+1 右-1
     *      TopAndBottom: 上+1 下-1
     * for循环完以后判断两个值是否都等于0 等于的话 代表在原点
     *
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        int leftAndRight = 0;
        int TopAndBottom = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    leftAndRight++;
                    break;
                case 'R':
                    leftAndRight--;
                    break;
                case 'U':
                    TopAndBottom++;
                    break;
                case 'D':
                    TopAndBottom--;
                    break;
            }
        }
        return leftAndRight == 0 && TopAndBottom == 0;
    }
}
