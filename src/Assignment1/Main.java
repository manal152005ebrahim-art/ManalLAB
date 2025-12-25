package Assignment1;

import static Assignment1.LinkedList.ConcatenateList.concatenate;
import static Assignment1.SingleyLinkedList.SinglyList.removeAtPosition;
import static Assignment1.SingleyLinkedList.SinglyList.search;
import static Assignment1.array.ArrayOperations.removeElement;
import static Assignment1.doubleLinkedList.CircularLinkedList.insert;

public class Main {
public static void main(String[] args) {
    // assignment1.3
    //  int[] arr = {1, 2, 3, 4, 5};

    // Clone array
    //int[] cloned = arr.clone();

    // Remove element
    //int[] newArr = removeElement(arr, 3);

    // System.out.println("Cloned Array:");
    //for (int x : cloned)
    // System.out.print(x + " ");

    // System.out.println("\nAfter Removing 3:");
    //  for (int x : newArr)
    //  System.out.print(x + " ");

//assignment 5
    //LinkedList.Node a = new LinkedList.Node(1);
    //a.next = new LinkedList.Node(2);

    //LinkedList.Node b = new LinkedList.Node(3);
    //b.next = new LinkedList.Node(4);

    //  LinkedList.Node result = concatenate(a, b);

    // while (result != null) {
    //  System.out.print(result.data + " ");
    // result = result.next;
    //}

    //assignment 7,9
    //SingleyLinkedList.SinglyList.Node head = new SingleyLinkedList.SinglyList.Node(10);
    //head.next = new SingleyLinkedList.SinglyList.Node(20);
    //head.next.next = new SingleyLinkedList.SinglyList.Node(30);

    //System.out.println("Position: " + search(head, 20));
    //  head = removeAtPosition(head, 1);

    //while (head != null) {
    // System.out.print(head.data + " ");
    //   head = head.next;
    // }
    //assignment 11
    //doubleLinkedList.DNode head = new doubleLinkedList.DNode(1);
    //head.next = new doubleLinkedList.DNode(2);
    //head.next.prev = head;
    //head.next.next = new doubleLinkedList.DNode(1);
    //head.next.next.prev = head.next;

    //removeDuplicates(head);

    //while (head != null) {
    // System.out.print(head.data + " ");
    //   head = head.next;
    // }

//assignment 13, 15
    doubleLinkedList.CNode head = null;

    head = insert(head, 10);
    head = insert(head, 20);
    head = insert(head, 30);

    System.out.println("Search 20: " + search(head, 20));
    System.out.println("Search 40: " + search(head, 40));
}
}



