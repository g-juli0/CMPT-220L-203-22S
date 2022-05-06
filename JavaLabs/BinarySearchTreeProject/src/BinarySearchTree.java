
/**
 * @author gianna julio
 * Binary Search Tree Project
 * CMPT220 - Marist College
 * May 2022
 */
public class BinarySearchTree {
	
	Node root;

    /**
     * default constructor - instantiates an empty tree with an empty root
     */
    public BinarySearchTree() {
    	this.root = null;
    }
    
    /**
     * @param tempRoot root of the current branch being traversed. begins at root of tree
     * @param n new node being inserted into the tree
     * @return new Node n becomes tempRoot, return pointer of node to break recursion
     */
    public Node insert(Node tempRoot, Node n) {
    	// if empty Node, make the new node the temporary root
    	if (tempRoot == null) {
    		tempRoot = n;
    		
    		// return pointer to break out of recursion
    		return tempRoot;
    		
    		// this case will be reached once there are no more subtrees to traverse
    		// and the new Node is in the correct place
    	}
    	
    	// insert into the LEFT subtree of the current tempRoot
	    if (n.value < tempRoot.value) {
	        tempRoot.leftChild = insert(tempRoot.leftChild, n); 
	    }
	    
	    // insert into the RIGHT subtree of the current tempRoot
	    else if (n.value > tempRoot.value) {
	        tempRoot.rightChild = insert(tempRoot.rightChild, n);
	    }
	    
	    // return pointer to break out of recursion
	    return tempRoot;    		
    }
    
    /**
     * @param tempRoot temporary root of branch being traversed
     * @param value integer value of Node being searched for
     * @return Node with specified value, null if not found
     */
    public Node search(Node tempRoot, int value) {
    	// Base Case - root is null or value is at root 
        if (tempRoot == null || tempRoot.value == value) {
            return tempRoot;
        }
        // value is greater than root value - search left branch
        if (tempRoot.value > value) {
            return search(tempRoot.leftChild, value); 
        }
        // value is less than root value - search right branch
        return search(tempRoot.rightChild, value);
    }
    
    public int findHeight(int height) {
    	return 42;
    }
    
    /**
     * @param root of the current branch being traversed. begins at root of tree
     * @return the leftmost (smallest) value found in the tree
     */
    public int findSmallestElement(Node root) {
    	// initially smallest = root
        int smallest = root.value; 
        // loop through tree to find smallest
        Node tempRoot = root;
        while (tempRoot.leftChild != null)  { 
            smallest = tempRoot.leftChild.value; 
            tempRoot = tempRoot.leftChild; 
        } 
        return smallest; 
    }
    
    /**
     * @param root of the current branch being traversed. begins at root of tree
     * @return the rightmost (largest) value found in the tree
     */
    public int findLargestElement(Node root) {
    	// initially largest = root
        int largest = root.value; 
        // loop through tree to find smallest
        Node tempRoot = root;
        while (tempRoot.rightChild != null)  { 
            largest = tempRoot.rightChild.value; 
            tempRoot = tempRoot.rightChild; 
        } 
        return largest; 
    }
    
    public int findNthLargestElement() {
    	// find smallest
    	// traverse through (inorder?) and find the nth number
    	return 42;
    }
    
    /**
     * @param tempRoot temporary root of branch being traversed. starts at root of tree
     * @param value integer value of Node to be deleted
     * @return Node that takes the place of the deleted node
     */
    public Node delete(Node tempRoot, int value) {
    	
    	// tree is empty
        if (tempRoot == null) {
        	return tempRoot; 
        }
   
        // traverse LEFT subtree
        if (value < tempRoot.value) {
            tempRoot.leftChild = delete(tempRoot.leftChild, value);
        }
        
        // traverse RIGHT subtree
        else if (value > tempRoot.value) {
            tempRoot.rightChild = delete(tempRoot.rightChild, value);
        }
        
        else { 
        	
            // Node contains only one child
            if (tempRoot.leftChild == null) {
                return tempRoot.rightChild; 
            }
            else if (tempRoot.rightChild == null) {
                return tempRoot.leftChild; 
            }
   
            // Node has two children
            // get inOrder successor (minimum value in the right subtree) 
            tempRoot.value = findSmallestElement(tempRoot.rightChild); 
   
            // Delete the inOrder successor 
            tempRoot.rightChild = delete(tempRoot.rightChild, tempRoot.value); 
        } 
        return tempRoot;
    	
    }
    
    public void reorganize() {
    	
    }
    
    /**
     * @param tempRoot root that printing starts out. root of binary tree
     */
    public void inOrder(Node tempRoot) {
    	// left, root, right
    	if (tempRoot != null) {
            inOrder(tempRoot.leftChild); 
            System.out.print(tempRoot.value + " "); 
            inOrder(tempRoot.rightChild); 
        }
    }
    
    /**
     * @param tempRoot root that printing starts out. root of binary tree
     */
    public void preOrder(Node tempRoot) {
    	// root, left, right
    	if (tempRoot != null) {
    		System.out.print(tempRoot.value + " "); 
            inOrder(tempRoot.leftChild); 
            inOrder(tempRoot.rightChild); 
        }
    }
    
    /**
     * @param tempRoot root that printing starts out. root of binary tree
     */
    public void postOrder(Node tempRoot) {
    	// left, right, root
    	if (tempRoot != null) {
            inOrder(tempRoot.leftChild); 
            inOrder(tempRoot.rightChild); 
            System.out.print(tempRoot.value + " "); 
        }
    }
    
    public Node depthFirstSearch(int value) {
    	return null;
    }
    
    public Node breadthFirstSearch(int value) {
    	return null;
    }

}