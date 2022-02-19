public class LinkedList {
    private Node head;
    private int size = 0;

    public void add(int element) {
        Node newNode = new Node(element);
        if (!isEmpty()) {
            newNode.next = head;
        }
        this.head = newNode;
        size++;
    }

    public int getIndex(int index) {
        checkIndex(index);
        int result = 0;
        int currentIndex = 0;
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentIndex == index) {
                result = currentNode.getNumber();
                break;
            }
            currentIndex++;
            currentNode = currentNode.next;
        }

        return result;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > getSize() - 1) {
            throw new IndexOutOfBoundsException("Invalid index or the index is larger than the size of the list.");
        }
    }

    public int getSize() {
        return size;

    }

    private boolean isEmpty() {
        return getSize() == 0;
    }
}


