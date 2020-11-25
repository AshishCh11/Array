public class LinkedListDemo {
    private static class Node {
        public int data;
        Node next;
 
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
 
    Node head;
 
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.push(10);
        list.push(20);
        list.push(20);
        list.push(30);
        System.out.println("List after removing duplicates: ");
        list.removeDuplicates();
        list.display();
    }
 
    public void push(int n) {
        Node p = new Node(n);
        p.next = head;
        head = p;
    }
 
    /*
     * since its a sorted list, we can just compare consecutive elements to find
     * the duplicates
     */
    public void removeDuplicates() {
        Node current = head;
 
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
 
    public void display() {
        Node tempDisplay = head; // start at the beginning of linkedList
        while (tempDisplay != null) { // Executes until we don't find end of
                                        // list.
            System.out.println(tempDisplay.data);
            tempDisplay = tempDisplay.next; // move to next Node
        }
    }
}
 