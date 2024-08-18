package leetcode50;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        PrintLinkedList printLinkedList = new PrintLinkedList();
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(21);
        head.next = new Node(2);
        head.next.next = new Node(33);
        head.next.next.next = new Node(14);
        head.next.next.next.next = new Node(95);
        head.next.next.next.next.next = new Node(55);
        printLinkedList.printListData(head);
        System.out.println();
        Node n = middleOfLinkedList(head);
        System.out.println(n.val);
    }

    public static Node middleOfLinkedList(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
