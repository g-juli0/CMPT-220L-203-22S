package base;

public class Dog extends Mammal implements Quadraped{
    public Dog(boolean hasFur, Integer height, Integer weight) {
        super(hasFur, height, weight);
    }

    public void announce(){
        System.out.println("Woof!");
    };
}
