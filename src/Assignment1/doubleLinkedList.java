package Assignment1;

public class doubleLinkedList {

    static class CNode {
        int data;
        CNode next;

        CNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class CircularLinkedList {

        // Insert node
        static CNode insert(CNode head, int data) {
            CNode newNode = new CNode(data);

            // If list is empty
            if (head == null) {
                newNode.next = newNode;
                return newNode;
            }

            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;

            return head;
        }

        // Search element
        static boolean search(CNode head, int key) {
            if (head == null)
                return false;

            CNode temp = head;
            do {
                if (temp.data == key)
                    return true;
                temp = temp.next;
            } while (temp != head);

            return false;
        }




        }

























}




