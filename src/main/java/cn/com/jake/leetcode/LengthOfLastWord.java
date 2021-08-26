package cn.com.jake.leetcode;

/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
 * <p>
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 * <p>
 * 输入：s = "Hello World"
 * 输出：5
 * <p>
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 * <p>
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 *
 * @author yujuan
 */
public class LengthOfLastWord {

    public static int lengthOfLastWord(String str) {
        int result = 0;
        str = str.trim();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            result++;
        }
        return result;
    }
}
