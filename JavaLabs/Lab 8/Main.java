package base;

public class Main {

    public static void main(String[] args) {

        LinkedList test = new LinkedList();

	    test.add(5);
        test.add(3);
        test.add(1);
        test.printList();
        test.delete(3);
        test.printList();
        test.sort();
        test.printList();
    }
}
