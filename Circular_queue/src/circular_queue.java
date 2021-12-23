
class circular_queue {
    private int s;
    private int f, b, nelm;
    private int ar[];

    public circular_queue(int size) {
        s = size;
        ar = new int[s];
        f = 0;
        b = 0;
        nelm = 0;
    }

    public boolean isfull() {
        return (nelm == s);
    }

    public void push(int x) {

        if (!isfull()) {
            ar[b % s] = x;
            b++;
            nelm++;
        } else
            System.out.println("queue array is full");
    }

    public boolean isempty() {
        return (nelm == 0);
    }

    public int pop() {
        if (!isempty()) {
            nelm--;
            int x = ar[f++];
            f %= s;
            return x;
        } else {
            return -1;
        }
    }

    public int top() {
        if (!isempty())
            return ar[f];
        else
            return -1;
    }

    public static void main(String[] args) {

    }
}
