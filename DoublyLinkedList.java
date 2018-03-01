package doublylinkedlist;

public class DoublyLinkedList {

    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i <= 5; i++) {
            list.append(i);
        }
        list.print();
        list.remove(5);
        list.print();
    }
}
