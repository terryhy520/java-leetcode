package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import com.leetcode.easy.MergeTwoSortedLists.ListNode;

public class MergeTwoSortedListsTest {
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
    public void testMergeTwoLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode l1 = buildList(new int[]{1,2,4});
        ListNode l2 = buildList(new int[]{1,3,4});
        ListNode merged = solution.mergeTwoLists(l1, l2);
        Assert.assertArrayEquals(new int[]{1,1,2,3,4,4}, toArray(merged));
    }
}
