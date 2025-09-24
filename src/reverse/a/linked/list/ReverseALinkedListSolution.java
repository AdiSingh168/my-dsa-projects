package reverse.a.linked.list;

class ReverseALinkedListSolution {

    public Node solution(Node input) {
        if (input == null || input.next == null) {
            return input;
        }
        Node prev = null;
        Node curr = input;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        input = prev;

        /*
            1 -> 2 -> 3

            1.next = 2
            2.next = 3
            3.next = null

            1 =>    temp = 2;
                    prev = null;    -> 1;
                    curr = 1;       -> 2;
                    1.next = 2;     -> null;

            2 =>    temp = 3;
                    prev = 1;    -> 2;
                    curr = 2;    -> 3;
                    2.next = 3;  -> 1;

            3 =>    temp = null;
                    prev = 2;       -> 3;
                    curr = 3;       -> null;
                    3.next = null;  -> 2;

            1.next = null
            2.next = 1
            3.next = 2

            3 -> 2 -> 1
         */

        return input;
    }

    public void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("Empty linked list\n");
            return;
        }
        while (head.next != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println(head.data);
    }

}

class Node {
    int data;
    Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }
}
