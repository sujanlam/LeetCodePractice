package leetcode50;

public class PrintLinkedList {
    public static void printListData(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
}
