package doublylinkedlist;

public class List {

    Node root;

    List() {
    }

    void append(int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node tmp = root;
        if (root == null) {
            root = newNode;
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.prev = tmp;
        }
    }

    void remove(int target) {
        Node tmp = root;
        if (root.data == target) {
            if (root.next == null) {
                root = null;
                return;
            }
            root = root.next;
        } else {
            while (tmp.next != null) {
                if (tmp.data == target) {
                    tmp.prev.next = tmp.next;
                }
                tmp = tmp.next;
            }
            if (tmp.data == target) {
                tmp.prev.next = null;
            }
        }
    }

    void print() {
        Node tmp = root;
        if (tmp == null) {
            System.out.println("root of list is empty");
        }
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println("");
    }
}
