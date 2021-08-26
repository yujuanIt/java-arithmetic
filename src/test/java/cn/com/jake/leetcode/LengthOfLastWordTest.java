package cn.com.jake.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

    @Test
    public void test() {
        int result1 = LengthOfLastWord.lengthOfLastWord("Hello World");
        assertEquals(5, result1);
        int result2 = LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, result2);
        int result3 = LengthOfLastWord.lengthOfLastWord("luffy is still joyboy");
        assertEquals(6, result3);
    }

}