class queue {
  private int s;
  private int f, b;
  private int ar[];

  public queue(int size) {
    s = size;
    ar = new int[s];
    f = 0;
    b = -1;
  }

  public boolean isfull() {
    return (b == s - 1);
  }

  public void push(int x) {
    if (!isfull()) {
      ar[++b] = x;
    } else
      System.out.println("queue array is full");
  }

  public boolean isempty() {
    return (b == -1 || f > b);
  }

  public int pop() {
    if (!isempty()) {
      return ar[f++];
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
