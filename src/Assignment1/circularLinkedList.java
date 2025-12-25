package Assignment1;

public class circularLinkedList {
    static class CNode {
        int data;
        CNode next;
        CNode(int d) { data = d; }
    }

    public static class CircularList {

        CNode insert(CNode head, int data) {
            CNode node = new CNode(data);
            if (head == null) {
                node.next = node;
                return node;
            }
            CNode temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            node.next = head;
            return head;
        }

        static boolean search(CNode head, int key) {
            CNode temp = head;
            do {
                if (temp.data == key) return true;
                temp = temp.next;
            } while (temp != head);
            return false;
        }


    }

}
