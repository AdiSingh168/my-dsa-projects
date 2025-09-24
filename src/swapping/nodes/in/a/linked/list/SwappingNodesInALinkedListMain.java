package swapping.nodes.in.a.linked.list;

public class SwappingNodesInALinkedListMain {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        node.next.next.next.next = new ListNode(5);

        SwappingNodesInALinkedList solution = new SwappingNodesInALinkedList();
        ListNode output = solution.solution(node, 2);
        System.out.println("Done");
    }

}
