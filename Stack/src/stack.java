public class stack {

    private int s;
    private int[] ar;
    private int nelm;
    private int top;

    public stack(int size) {
        s = size;
        ar = new int[s];
        nelm = 0;
        top = -1;
    }

    public boolean isfull() {
        return (nelm == ar.length);
    }

    public void push(int x) {
        if (!isfull()) {
            ar[++top] = x;
            nelm++;
        } else {
            System.out.println("Stack array is full");
        }
    }

    public boolean isempty() {
        return (nelm == 0);
    }

    public int peek() {
        if (!isempty()) {
            nelm--;
            return ar[top--];
        } else {
            return -1;
        }
    }

    public int top() {
        if (!isempty()) {
            return ar[top];
        } else {
            return -1;
        }
    }
    public void display() {
    for (int i = top; i >= 0; i--) {
      System.out.print(arr[i] + " ");
       }
        System.out.println();
    }

    public static void main(String[] args) {

        stack s = new stack(4);
        s.push(20);
        s.push(2);
        s.push(10);
        s.push(5);
        for (int i = 0; i < 4; i++) {
            System.out.print(s.peek() + " ");
            s.pop();
        }

    }
}
