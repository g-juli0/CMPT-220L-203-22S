/**
 * @author Gianna Julio
 * 
 * Node class allows user to chain together multiple
 * values similat to a LinkedList (i think)
 */
public class Node {

    // initialize local variables
    int value;
    Node pointer;

    /**
     * 
     * @param value integer value being added to the list
     * @param pointer the next object in the chain of Node
     */
    public Node(int data, Node pointer) {
        this.data = data;
        this.pointer = pointer;
    }

    /**
     * 
     * @param val new value to set the Node's integer value to
     */
    public setValue(int val) {
        value = val;
    }

    /**
     * 
     * @return value of Node
     */
    public int getValue() {
        return value;
    }

    /**
     * 
     * @param next new Node to link to
     */
    public setPointer(Node pointer) {
        this.pointer = pointer;
    }

    /**
     * 
     * @return next Node in chain
     */
    public Node getNextItem() {
        return pointer;
    }

    /**
     * toString function - returns String of value
     */
    public String toString() {
        return Integer.toString(value);
    }

}
