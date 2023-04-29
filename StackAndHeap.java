class StackAndHeap {
    private int[] stck;
    private int tos;

    public StackAndHeap(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stck[tos--];
        }
    }

    public static void main(String[] args) {
        StackAndHeap stack1 = new StackAndHeap(10);
        StackAndHeap stack2 = new StackAndHeap(10);

        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            stack2.push(i);
        }

        System.out.println("Stack in Stack 1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack1.pop());
        }

        System.out.println("Stack in Stack 2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack2.pop());
        }
    }
}