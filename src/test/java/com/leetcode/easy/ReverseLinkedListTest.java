package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import com.leetcode.easy.ReverseLinkedList.ListNode;

public class ReverseLinkedListTest {
    private ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private int[] toArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void testReverseList() {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode head = buildList(new int[]{1,2,3,4,5});
        ListNode reversed = solution.reverseList(head);
        Assert.assertArrayEquals(new int[]{5,4,3,2,1}, toArray(reversed));
    }
}
