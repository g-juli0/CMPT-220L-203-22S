/**
 * @author Gianna Julio
 * 
 * Node class allows user to chain together multiple
 * values similat to a LinkedList
 */
public class Node {

    // initialize local variables
    int value;
    Node pointer;

    // L, R, Parent

    /**
     * 
     * @param value integer value being added to the list
     */
    public Node(int data) {
        this.data = data;
    }

    /**
     * toString function - returns String of value
     */
    public String toString() {
        return Integer.toString(value);
    }

}
