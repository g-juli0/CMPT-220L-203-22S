/**
 * @author Gianna Julio
 * 
 * ListItem class allows user to chain together multiple
 * values similat to a LinkedList (i think)
 */
public class ListItem {

    // initialize local variables
    int value;
    ListItem next;

    /**
     * 
     * @param value integer value being added to the list
     * @param next the next object in the chain of ListItems
     */
    public ListItem(int value, ListItem next) {
        this.value = value;
        this.next = next;
    }

    /**
     * 
     * @param val new value to set the ListItem's integer value to
     */
    public setValue(int val) {
        value = val;
    }

    /**
     * 
     * @return value of ListItem
     */
    public int getValue() {
        return value;
    }

    /**
     * 
     * @param next new ListItem to link to
     */
    public setNext(ListItem next) {
        this.next = next;
    }

    /**
     * 
     * @return next ListItem in chain
     */
    public ListItem getNextItem() {
        return next;
    }

    /**
     * toString function - returns String of value
     */
    public String toString() {
        return Integer.toString(value);
    }

}
