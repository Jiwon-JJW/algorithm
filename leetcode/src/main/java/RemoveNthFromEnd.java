public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;

        // 뒤에서 n번째의 노드를 찾기 위해 미리 next 노드를 가리키도록 했다.
        while (n-- > 0)
            fast = fast.next;

        if (fast == null)
            return head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
