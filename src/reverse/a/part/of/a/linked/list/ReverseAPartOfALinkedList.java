package reverse.a.part.of.a.linked.list;

class ReverseAPartOfALinkedList {

    Node reverseAPartOfALinkedList(Node linkedList, int left, int right) {
        if (linkedList == null || left == right) {
            return linkedList;
        }

        int i;
        Node prev, curr, next;
        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.next = linkedList;
        prev = dummy;

        for (i = 0; i < left; i++) {
            prev = prev.next;
        }

        String start = prev;
        curr = prev.next;
        next = curr.next;

        while (i < right) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
            i++;
        }

        start.next = curr;

        return linkedList;
    }

}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    Node() {
    }
}
