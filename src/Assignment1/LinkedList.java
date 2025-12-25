package Assignment1;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public class ConcatenateList {

        static Node concatenate(Node a, Node b) {
            if (a == null) return b;
            Node temp = a;
            while (temp.next != null)
                temp = temp.next;
            temp.next = b;
            return a;
        }



        }
    }


