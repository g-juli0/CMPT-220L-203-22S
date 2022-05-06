import java.util.Scanner;

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
					
					// print inOrder to check (remove later)
					tree.inOrder(tree.root);
					
					// confirmation message
					System.out.println(". . . Value successfully added to tree.\n");
				}
				
				// search for an element
				else if (choice == 2) {
					
					// find element
					// find smallest element
					// find largest element
					// find nth largest element
					
					// depth first search
					// breadth first search
					
				}
				
				// find tree height
				else if (choice == 3) {
					
				}
				
				// delete an element				
				else if (choice == 4) {
					
				}
				
				// list elements
				else if (choice == 5) {
					
					// in order
					// pre order
					// post order
					
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
			System.out.println("Something went wrong. Try again.");
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

}
