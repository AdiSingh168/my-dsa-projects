package reverse.a.part.of.a.linked.list;

public class Main {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);

        ReverseAPartOfALinkedList solution = new ReverseAPartOfALinkedList();
        Node result = solution.reverseAPartOfALinkedList(node, 1, 2);
        System.out.println("done");
    }

}
