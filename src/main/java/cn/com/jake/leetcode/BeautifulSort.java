package cn.com.jake.leetcode;

import java.util.Arrays;

/**
 * 给定两个整数 n 和 k，你需要实现一个数组，这个数组包含从 1 到 n 的 n 个不同整数，同时满足以下条件：
 * <p>
 * ① 如果这个数组是 [a1, a2, a3, ... , an] ，那么数组 [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] 中应该有且仅有 k 个不同整数；.
 * <p>
 * ② 如果存在多种答案，你只需实现并返回其中任意一种.
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 3, k = 1
 * 输出: [1, 2, 3]
 * 解释: [1, 2, 3] 包含 3 个范围在 1-3 的不同整数， 并且 [1, 1] 中有且仅有 1 个不同整数 : 1
 *  
 * <p>
 * 示例 2:
 * <p>
 * 输入: n = 3, k = 2
 * 输出: [1, 3, 2]
 * 解释: [1, 3, 2] 包含 3 个范围在 1-3 的不同整数， 并且 [2, 1] 中有且仅有 2 个不同整数: 1 和 2
 *  
 * <p>
 * 提示:
 * <p>
 *  n 和 k 满足条件 1 <= k < n <= 10^4.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/beautiful-arrangement-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BeautifulSort {

    public static void main(String[] args) {
        Arrays.stream(constructArray(10, 9)).forEach(System.out::println);
    }


    /**
     * 假设
     * n=10 k=1 [1,2,3,4,5,6,7,8,9,10]    : 1
     * n=10 k=2 [1,3,2,4,5,6,7,8,9,10]    : 2 1
     * n=10 k=3 [1,4,2,3,5,6,7,8,9,10]    : 3 2 1
     * n=10 k=4 [1,5,2,4,3,6,7,8,9,10]    : 4 3 2 1
     * n=10 k=5 [1,6,2,5,3,4,7,8,9,10]    : 5 4 3 2 1
     * n=10 k=6 [1,7,2,6,3,5,4,8,9,10]    : 6 5 4 3 2 1
     * n=10 k=7 [1,8,2,7,3,6,4,5,9,10]    : 7 6 5 4 3 2 1
     * n=10 k=8 [1,9,2,8,3,7,4,6,5,10]    : 8 7 6 5 4 3 2 1
     * n=10 k=9 [1,10,2,9,3,8,4,7,5,6]    : 9 8 7 6 5 4 3 2 1
     * ***************************************************
     * 下标从[0,k]中 偶数下标依次是1,2,3,4.... 基数下标依次是 k+1,k,k-1... 后面[k+1,n-1]的下标的值是顺序填充
     * @param n
     * @param k
     * @return
     */
    public static int[] constructArray(int n, int k) {

        int index[] = new int[n];
        int numTemp = 1;
        int numK = k + 1;
        for (int i = 0; i <= k; i += 2) {
            index[i] = numTemp++;
        }
        for (int i = 1; i <= k; i += 2) {
            index[i] = numK--;
        }
        for (int i = k + 1; i < n; ++i) {
            index[i] = i + 1;
        }
        return index;

    }

}
