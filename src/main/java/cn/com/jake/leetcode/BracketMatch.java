package cn.com.jake.leetcode;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author yujuan
 */
public class BracketMatch {


    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    /**
     * 基于数组
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        //长度等于0 直接返回
        if (s.length() == 0) {
            return true;
        }
        //长度和1 做与运算,如果等于1 代表长度不为偶数 等价于  s.length/2!=0
        if ((s.length() & 1) == 1) {
            return false;
        }
        int index = 0;
        char[] stack = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack[index++] = s.charAt(i);
                    //碰到 ( [ { 以此入栈
                    continue;
                case ')':
                    //碰到) 代表) 要出栈 判断
                    if (index == 0 || stack[--index] != '(') {
                        return false;
                    }
                    continue;
                case ']':
                    if (index == 0 || stack[--index] != '[') {
                        return false;
                    }
                    continue;

                case '}':
                    if (index == 0 || stack[--index] != '{') {
                        return false;
                    }
                    continue;
                default:
                    return false;
            }
        }
        return index == 0;
    }


    /**
     * 基于栈
     * 遍历字符串
     * 检查如果是 ) ] } 则同时出栈 判断是否和对应的( [ { 匹配 不匹配则返回false 表示字符串无效
     * 检查如果是 ( [ { 则入栈
     * 遍历完成以后 判断栈里是否有数据 有数据 代表字符串无效 没有则字符串有效
     *
     * @param s
     * @return
     */
    private static boolean isValid2(String s) {

        //长度和1 做与运算 等于1 代表长度为计数 直接返回false 不匹配
        if ((s.length() & 1) == 1) {
            return false;
        }
        //遍历
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                stack.push(s.charAt(i));
            } else {
                switch (s.charAt(i)) {
                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        continue;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        continue;
                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        continue;
                    default:
                        stack.push(s.charAt(i));
                }
            }

        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
