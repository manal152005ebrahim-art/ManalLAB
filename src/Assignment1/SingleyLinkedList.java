package Assignment1;

public class SingleyLinkedList {
    public class SinglyList {

        static class Node {
            int data;
            Node next;
            Node(int d) { data = d; }
        }

        static int search(doubleLinkedList.CNode head, int key) {
            int pos = 0;
            while (head != null) {
                if (head.data == key) return pos;
                head = head.next;
                pos++;
            }
            return -1;
        }

        static Node removeAtPosition(Node head, int pos) {
            if (pos == 0) return head.next;
            Node temp = head;
            for (int i = 0; i < pos - 1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
            return head;
        }



        }
    }

