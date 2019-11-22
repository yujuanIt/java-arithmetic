package cn.com.jake.sort;

import java.util.Arrays;

/**
 * @Classname TestMain
 * @Description TODO
 * @Date 19-2-14 下午4:04
 * @Created by yujuan
 */
public class TestMain {

    //https://mp.weixin.qq.com/s?__biz=Mzg2MjEwMjI1Mg==&mid=2247490497&idx=2&sn=eec92aa0e4e43183a8cbcdefdf3dec7b&chksm=ce0dac42f97a2554207a912845fa5eb024e9317b52d64ba3e789cb880f23e97ea300869230c0&scene=0&xtrack=1&key=c5ab4947b0f2704f59fc97d89db3449415883c39da7b10b1f5122355518822d039cd6d46d27a5309591aba92c8b5adf8030e0d52571656ad930e355284836a994230d6c39f93f63bd00493f3d6264a37&ascene=1&uin=MjU2MjU4MTQ2MQ%3D%3D&devicetype=Windows+XP&version=62060841&lang=zh_CN&pass_ticket=o1ZV6D1ZE4pQhZqG9AI3DI354bGNi6i%2BjJQC8%2BgbvXP7Y9YDDjIxXJX3sriEKjwH
    public static void main(String[] args) {
        int[] array = {21, 2, 33, 4, 55, 6, 77};
        System.out.println("原数组是：" + Arrays.toString(array));
        BubblingSort bubblingSort = new BubblingSort();
        int[] sort = bubblingSort.sort(array);
        bubblingSort.arrayToString(sort);
    }

}
