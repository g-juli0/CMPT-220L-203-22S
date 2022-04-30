
public class Node {
	
    int value;
    
    Node parent;
    Node leftChild;
    Node rightChild;

    public Node(int value) {
    	
        this.value = value;
        
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }
}