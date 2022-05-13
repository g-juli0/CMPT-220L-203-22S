import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Gianna Julio
 * Marist College
 * CMPT220 - Software Development I
 * Binary Search Tree Project - Driver Class
 * 5/12/2022
 */
public class Main {
	
	// initialize Scanner
	static Scanner input = new Scanner(System.in);

	// MAIN PROGRAM METHOD - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public static void main(String[] args) {
		
		// print title
		System.out.println("Binary Tree Creator");
		System.out.println("-------------------");
		
		// initialize empty tree
		BinarySearchTree tree = new BinarySearchTree();
		
		// initialize choice value
		int choice = -1;
		
		// try-except to catch any wrong inputs or other issues
		try {
			
			// keep running loop until user decides to quit (choice == 0)
			while (choice != 0) {
				choice = printMenu();
				
				// insert an element
				if (choice == 1) {
					
					// get value
					System.out.print("Enter value: ");
					int value = input.nextInt();
					
					// create new Node with value from user
					Node n = new Node(value);
					
					// insert the new Node beginning at the tree's root
					tree.root = tree.insert(tree.root, n);
					
					// confirmation message
					System.out.println("\n. . . Value successfully added to tree.\n");
				}
				
				// search for an element
				else if (choice == 2) {
					
					int choice2 = -1;
					
					while (choice2 != 0) {
						choice2 = printSearchMenu();
						
						// find element
						if (choice2 == 1) {
							
							// get target value
							System.out.print("Enter target value: ");
							int target = input.nextInt();
							
							Node targetNode = tree.search(tree.root, target);
							
							// if Node with the target value exists in tree, print confirmation
							if (targetNode != null) {
								System.out.println("Target value " + Integer.toString(target) + " is an element in the binary tree.");
							}
							
							// Node not found
							else {
								System.out.println("Target value " + Integer.toString(target) + " not found in binary tree.");
							}
							
						}
						
						// find smallest element
						else if (choice2 == 2) {
							System.out.println("The smallest element in the binary tree is " + Integer.toString(tree.findSmallestElement(tree.root)));
						}
						
						// find largest element
						else if (choice2 == 3) {
							System.out.println("The largest element in the binary tree is " + Integer.toString(tree.findLargestElement(tree.root)));
						}
						
						// find nth largest element
						else if (choice2 == 4) {
							System.out.print("Enter value of n: ");
							int n = input.nextInt();
														
							System.out.println("The " + Integer.toString(n) + "th largest element in the binary tree is " + Integer.toString(tree.findNthLargestElement(tree.root, new ArrayList<Node>(), n)));
							
						}
						
						// depth first search
						else if (choice2 == 5) {
							
							// get target value
							System.out.print("Enter target value: ");
							int target = input.nextInt();
							
							Node targetNode = tree.depthFirstSearch(tree.root, target);
							
							// if Node with the target value exists in tree, print confirmation
							if (targetNode != null) {
								System.out.println("Target value " + Integer.toString(target) + " is an element in the binary tree.");
							}
							
							// Node not found
							else {
								System.out.println("Target value " + Integer.toString(target) + " not found in binary tree.");
							}
							
						}
						
						// breadth first search
						else if (choice2 == 6) {
							
							// get target value
							System.out.print("Enter target value: ");
							int target = input.nextInt();
							
							Node targetNode = tree.breadthFirstSearch(tree.root, target);
							
							// if Node with the target value exists in tree, print confirmation
							if (targetNode != null) {
								System.out.println("Target value " + Integer.toString(target) + " is an element in the binary tree.");
							}
							
							// Node not found
							else {
								System.out.println("Target value " + Integer.toString(target) + " not found in binary tree.");
							}
						}
						
					}
				}
				
				// find tree height
				else if (choice == 3) {
					System.out.println("The height of the binary tree is " + Integer.toString(tree.height(tree.root)));				
				}
				
				// delete an element				
				else if (choice == 4) {
					// get value
					System.out.print("Enter value: ");
					int value = input.nextInt();
					
					// insert the new Node beginning at the tree's root
					tree.root = tree.delete(tree.root, value);
					
					// confirmation message
					System.out.println("\n. . . Value successfully deleted from tree.\n");
				}
				
				// list elements
				else if (choice == 5) {
					
					int choice3 = -1;
					
					while (choice3 != 0) {
						choice3 = printListMenu();
						
						// in order
						if (choice3 == 1) {
							tree.inOrder(tree.root);
						}
						
						// pre order
						else if (choice3 == 2) {
							tree.preOrder(tree.root);
						}
						
						// post order
						else if (choice3 == 3) {
							tree.postOrder(tree.root);
						}
					}
					
				}
				
				// invalid option
				else {
					// if choice is anything other than 0-5
					if (choice != 0) {
						System.out.println("Invalid option. Try again.");
					}
				}
				
			}
			
			System.out.println("\n. . . Exiting program. Thank you!");
			
		} 
		
		// catches all Exceptions
		catch (Exception ex) {
			System.out.println("\nSomething went wrong. Try again.");
		}
	}
	
	// HELPER METHODS - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	
	/**
	 * prints the option menu and gets user choice
	 * @return int value of choice picked by user
	 */
	public static int printMenu() {
		System.out.println("\nWhat would you like to do? ");
		System.out.println("\n\t0 - Quit");
		System.out.println("\t1 - Insert an Element");
		System.out.println("\t2 - Search for an Element");
		System.out.println("\t3 - Find Tree Height");
		System.out.println("\t4 - Delete an element");
		System.out.println("\t5 - List Elements");
		
		System.out.print("\nEnter choice: ");
		return input.nextInt();
	}
	
	/**
	 * prints the search menu and gets user choice
	 * @return int value of choice picked by user
	 */
	public static int printSearchMenu() {
		System.out.println("\nWhat would you like to do? ");
		System.out.println("\n\t0 - Return to Main Menu");
		System.out.println("\t1 - Search for a value");
		System.out.println("\t2 - Find largest element");
		System.out.println("\t3 - Find smallest element");
		System.out.println("\t4 - Find Nth largest element");
		System.out.println("\t5 - Depth first search");	
		System.out.println("\t6 - Breadth first search");		

		System.out.print("\nEnter choice: ");
		return input.nextInt();
	}
	
	/**
	 * prints the options for listing the elements of the BST
	 * @return int value of choice picked by user
	 */
	public static int printListMenu() {
		System.out.println("\nWhat would you like to do? ");
		System.out.println("\n\t0 - Return to Main Menu");
		System.out.println("\t1 - List in order");
		System.out.println("\t2 - List pre order");
		System.out.println("\t3 - List post order");
		
		System.out.print("\nEnter choice: ");
		return input.nextInt();
	}
}
