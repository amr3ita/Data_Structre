public class priority_queue {
    private int s;
    private int[] ar;
    private int nelm;
    private int top;

    public priority_queue(int size) {
        s = size;
        ar = new int[s];
        nelm = 0;
        top = -1;
    }

    public boolean isfull() {
        return (nelm == s);
    }

    public void push(int x) {
        int i;
        if (!isfull()) {
            for (i = nelm - 1; i >= 0; i--) {
                if (ar[i] > x) {
                    ar[i + 1] = ar[i];
                } else {
                    break;
                }
            }
            ar[i + 1] = x;
            nelm++;
            top = nelm - 1;
        } else {
            System.out.println("Queue is full");
        }
    }

    public boolean isempty() {
        return (nelm == 0);
    }

    public int pop() {
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

    public static void main(String[] args) {
        priority_queue pq = new priority_queue(10);
        pq.push(20);
        pq.push(2);
        pq.push(10);
        pq.push(5);
        for (int i = 0; i < 4; i++) {
            System.out.print(pq.top() + " ");
            pq.pop();
        }

    }
}
