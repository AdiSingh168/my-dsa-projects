package reverse.a.linked.list;

public class ReverseALinkedListSolutionMain {

    public static void main(String[] args) {
        ReverseALinkedListSolution reverseALinkedListSolution = new ReverseALinkedListSolution();

        // get input & print output
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Before reversing");
        reverseALinkedListSolution.printLinkedList(head);

        //reverse list
        Node reversed = reverseALinkedListSolution.solution(head);

        //print output
        System.out.println("After reversing");
        reverseALinkedListSolution.printLinkedList(reversed);
    }

}
