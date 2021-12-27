class Node {
    int data;
    Node left;
    Node right;
}

public class Tree {
    Node root;

    public void insert(int value) {
        Node newnode = new Node();
        if (root == null) {
            newnode.data = value;
            root = newnode;
        } else {
            newnode.data = value;
            Node current = root;
            while (true) {
                if (value < current.data) {
                    if (current.left == null) {
                        current.left = newnode;
                        return;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = newnode;
                        return;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }

    public void search(int key) {
        Node current = root;
        while (current.data != key) {
            if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                System.out.println("Not Found");
                return;
            }
        }
        System.out.println("Found");

    }

    public int findmin() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findmax() {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void preOrder(Node localroot) {
        if (localroot != null) {
            System.out.print(localroot.data + " ");
            preOrder(localroot.left);
            preOrder(localroot.right);
        }
    }

    public void inOrder(Node localroot) {
        if (localroot != null) {
            inOrder(localroot.left);
            System.out.print(localroot.data + " ");
            inOrder(localroot.right);
        }
    }

    public void postOrder(Node localroot) {
        if (localroot != null) {
            postOrder(localroot.left);
            postOrder(localroot.right);
            System.out.print(localroot.data + " ");
        }
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(15);
        t.insert(9);
        t.insert(40);
        t.insert(2);
        t.insert(13);
        t.insert(28);
        t.insert(80);
        t.inOrder(t.root);
        System.out.println();
        t.preOrder(t.root);
        System.out.println();
        t.postOrder(t.root);
        System.out.println();
    }
}
