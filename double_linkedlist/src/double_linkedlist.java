class Node {
    int data;
    Node next;
    Node prev;
}

public class double_linkedlist {
    Node first;
    Node last;
    int size = 0;

    public boolean isEmpty() {
        return (size == 0);
    }

    public void insertfirst(int value) {
        Node newnode = new Node();
        newnode.data = value;
        if (first == null) {
            last = newnode;
        } else {
            newnode.next = first;
            first.prev = newnode;
        }
        first = newnode;
        size++;
    }

    public void insertlast(int value) {
        if (last == null) {
            insertfirst(value);
            return;
        }
        Node newnode = new Node();
        newnode.data = value;
        last.next = newnode;
        newnode.prev = last;
        last = newnode;
        size++;
    }

    public void insertposition(int pos, int value) {
        if (pos < 0 || pos > size) {
            return;
        } else if (pos == 0) {
            insertfirst(value);
            return;
        } else if (pos == size) {
            insertlast(value);
            return;
        } else if (pos > 0 && pos < size) {
            Node current = first;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            Node newnode = new Node();
            newnode.data = value;
            newnode.next = current.next;
            newnode.prev = current;
            current.next.prev = newnode;
            current.next = newnode;
        }
    }

    public void deletefirst() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            first = last = null;
        } else if (size > 1) {
            first = first.next;
            first.prev = null;
        }
        size--;
    }

    public void deletelast() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            first = last = null;
        } else if (size > 1) {
            last = last.prev;
            last.next = null;
        }
        size--;
    }

    public void deleteitem(int key) {
        if (size == 0) {
            return;
        }

        if (first.data == key) {
            deletefirst();
            return;
        } else if (last.data == key) {
            deletelast();
            return;
        }

        Node current = first;
        while (current.next != null) {
            if (current.data == key) {
                break;
            }
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    public void search(int key) {
        Node current = first;
        int i = 0;
        while (current != null) {
            if (current.data == key) {
                System.out.println(key + " Found in index " + i);
                return;
            }
            current = current.next;
            i++;
        }
        System.out.println(key + " Not Found");
    }

    public void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

    }
}
