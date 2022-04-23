package base;

public class LinkedList {

    // initialize local variables
    ArrayList<Node> list = new ArrayList<>();
    Node root;

    // constructor - instantiated with no root, empty LinkedList
    public LinkedList(){
        this.root = null;
    }

    public addNode(int value) {
        // if there is no root, the new value is added as the root
        if (this.root == null) {
            this.root = new Node(value);
            System.out.println("The value " + value + " has been added successfully.");
        } else {
            // store the root in a temporary Node object for comparisons
            Node tempNode = this.root;
            // loop through the ArrayList until the last Node (with no pointer) is found
            while (tempNode.pointer != null) {
                tempNode = tempNode.pointer;
            }
            // set the last Node's pointer to the new Node
            tempNode.pointer = new Node(value);
            System.out.println("The value " + value + " has been added successfully.");
        }

    }

    public void delete(int value) {
        // no root, empty LinkedList
        if (this.root == null) {
            System.out.println("The root hasn't been set yet. The value isn't in the list.");
        } else {
            // store root in temporary Node
            Node tempNode = this.root;
            // loop through the list until the value being removed is found or the end is reached
            while (tempNode.pointer.value != value || tempNode.pointer == null) {
                tempNode = tempNode.pointer;
            }
            // tempNode stores the Node immediately BEFORE the Node to be deleted
            if (tempNode.pointer.pointer != null) {
                // set the previous Node's pointer to the Node AFTER the Node being deleted
                tempNode.pointer = tempNode.pointer.pointer;
            } else {
                // end of the list, delete pointer
                tempNode.pointer = null;
            }
            System.out.println("The value " + value + " has been deleted successfully.");
        }
    }

    public void sort() {
        // bubble sort
        boolean notSwapped = false;
        Node tempNode;

        while (!notSwapped) {
            Integer listLen = this.length();
            notSwapped = true;
            tempNode = this.root;
            Node lastNode = null;

            for (var index = 0; index < listLen; index++){
                if (tempNode.pointer != null && tempNode.value > tempNode.pointer.value) {
                    tempNode = swap(tempNode);
                    if (index == 0) {
                        this.root = tempNode;
                    } else {
                        lastNode.pointer = tempNode;
                    }
                    lastNode = tempNode;
                    tempNode = tempNode.pointer;
                    notSwapped = false;
                }
            }
        }
    }

    // helper function for sort()
    public Node swap(Node root) {
        Node temp = root;
        Node tempNextNode = root.pointer.pointer;
        root = root.pointer;
        root.pointer = temp;
        if (tempNextNode != null) {
            root.pointer.pointer = tempNextNode;
        } else {
            root.pointer.pointer = null;
        }
        return root;

    }

    public printList(){
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        // if not empty
        if (this.root != null) {
            Node tempNode = this.root;
            // loop through each Node until there is no pointer (end of list)
            while (tempNode.pointer != null) {
                // add value to tempArr
                tempArr.add(tempNode.value);
                tempNode = tempNode.pointer;
            }
            // add last value
            tempArr.add(tempNode.value);
        }
        System.out.println(tempArr);
    }
}
