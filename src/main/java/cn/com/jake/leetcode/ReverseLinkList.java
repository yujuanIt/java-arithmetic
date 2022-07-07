package cn.com.jake.leetcode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 反转链表
 * <p>
 * <p>
 * 输入  1 2 3 4 5
 * <p>
 * 输出 5 4 3 2 1
 */
public class ReverseLinkList {

    public static void main(String[] args) {
        LinkNode node = LinkNode.builder()
                .value(1)
                .next(LinkNode.builder()
                        .value(2)
                        .next(LinkNode.builder()
                                .value(3)
                                .next(LinkNode.builder()
                                        .value(4)
                                        .next(LinkNode.builder()
                                                .value(5)
                                                .next(null)
                                                .build())
                                        .build())
                                .build())
                        .build())
                .build();
        System.out.println(node);
    }

    public static void reverseLinkList(ListNode node) {
        ListNode next = null;
        ListNode prev = null;
        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
    }


    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    @Builder
    public static class LinkNode {
        private int value;
        private LinkNode next;
    }
}
