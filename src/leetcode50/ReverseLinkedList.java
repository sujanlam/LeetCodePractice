package leetcode50;

import java.util.HashMap;

public class ReverseLinkedList {
    public static void main(String[] args) {
        PrintLinkedList printLinkedList = new PrintLinkedList();
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(21);
        head.next = new Node(12);
        head.next.next = new Node(33);
        head.next.next.next = new Node(14);

        printLinkedList.printListData(head);
        // Reversing the linked list
        Node reversedHead = reverseLinkedList(head);
        System.out.println();
        // Printing the reversed linked list: 4 -> 3 -> 2 -> 1 -> null
        printLinkedList.printListData(reversedHead);
    }

    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = current.next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node findMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
