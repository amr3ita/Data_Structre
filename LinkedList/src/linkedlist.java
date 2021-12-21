
class Node {
    int data;
    Node next;
}

public class linkedlist {
    Node first;
    Node last;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertfirst(int value) {
        Node newnode = new Node();
        newnode.data = value;
        if (first == null) {
            last = newnode;
        }
        newnode.next = first;
        first = newnode;
    }

    public void deletefirst() {
        if (first == null) {
            return;
        } else if (first.next == null) {
            last = null;
        }
        first = first.next;
    }

    public void insertlast(int value) {
        Node newnode = new Node();
        newnode.data = value;
        if (first == null) {
            first = newnode;
        } else {
            last.next = newnode;
        }
        last = newnode;
    }

    public void deletelast() {
        if (first == null)
            return;
        if (first == last)
            first = last = null;
        Node current = first;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
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

    public void insert(int pos, int value) {
        Node newnode = new Node();
        newnode.data = value;

        Node current = first;
        for (int i = 1; i < pos - 1; i++) {
            current = current.next;
        }
        if (pos == 1) {
            newnode.next = first;
            first = newnode;
        } else if (current == first) {
            newnode.next = current.next;
            current.next = newnode;
        } else if (current == last) {
            current.next = newnode;
            last = newnode;
        } else {
            newnode.next = current.next;
            current.next = newnode;
        }
    }

    public void deleteitem(int key) {
        Node current = first;
        Node prev = first;
        while (current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current == first) {
            deletefirst();
        } else if (current == last) {
            deletelast();
        } else {
            prev.next = current.next;
        }
    }

    public void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist li = new linkedlist();

        li.insertlast(5);
        li.insertlast(6);
        li.insertlast(9);
        li.insert(3, 4);

        li.display();
    }
}
