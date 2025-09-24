package swapping.nodes.in.a.linked.list;

class SwappingNodesInALinkedList {

    ListNode solution(ListNode head, int k) {
        ListNode KFromStart, previousOfKFromStart = null, KFromEnd = head, previousOfKFromEnd = null, end = head;
        if (k != 1) {
            previousOfKFromStart = head;
            for (int i = 2; i < k; i++) {
                previousOfKFromStart = previousOfKFromStart.next;
            }
            KFromStart = previousOfKFromStart.next;
        } else {
            KFromStart = head;
        }

        for (int i = 0; i < k; i++) {
            end = end.next;
        }
        while (end != null) {
            previousOfKFromEnd = KFromEnd;
            KFromEnd = KFromEnd.next;
            end = end.next;

        }

        if (previousOfKFromStart != null) {
            previousOfKFromStart.next = KFromEnd;
        }
        if (previousOfKFromEnd != null) {
            previousOfKFromEnd.next = KFromStart;
        }

        ListNode temp = KFromEnd.next;
        KFromEnd.next = KFromStart.next;
        KFromStart.next = temp;

        if (previousOfKFromStart == null) {
            return KFromEnd;
        } else if (previousOfKFromEnd == null) {
            return KFromStart;
        } else {
            return head;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
