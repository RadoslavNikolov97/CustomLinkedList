public class Node {


    private int number;
    public Node next;

    public Node(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return this.number + "";
    }


    public int getNumber() {
        return this.number;
    }
}