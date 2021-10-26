public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        ListNode pointer = head;

        while (pointer != null && pointer.next != null) {
            current = current.next;
            pointer = pointer.next.next;
        }

        return current;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode current = head;
        ListNode pointer = head;

        while (pointer != null && pointer.next != null) {
            current = current.next;
            pointer = pointer.next.next;
        }

        return current;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
