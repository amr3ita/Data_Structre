
class Node {
    int data;
    Node next;
}

public class linkedlist {
    Node first;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertfirst(int v) {
        Node newnode = new Node();
        newnode.data = v;
        newnode.next = first;
        first = newnode;
    }

    public void deletefirst() {
        first = first.next;
    }

    public Node search(int key) {
        Node current = first;
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node deleteitem(int key) {
        Node current = first;
        Node previous = first;

        while (current.data != key) {
            if (current.next == null) {
                return null;
            }
            previous = current;
            current = current.next;
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist li = new linkedlist();
        li.insertfirst(5);
        li.insertfirst(7);
        li.insertfirst(6);
        li.insertfirst(9);
        li.print();
        System.out.println(li.search(7));
        li.deletefirst();
        li.print();
        li.deleteitem(6);
        li.print();
    }
}
