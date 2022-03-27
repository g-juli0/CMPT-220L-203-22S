public class Main {
    public static void main(String[] args) {
        ListItem d = new ListItem(4, NONE);
        ListItem c = new ListItem(3, d);
        ListItem b = new ListItem(2, c);
        ListItem a = new ListItem(1, b);
    }
}
