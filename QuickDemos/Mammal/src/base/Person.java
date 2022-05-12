package base;

public class Person extends Mammal implements Biped{
    String SSN;
    Integer Intelligence;
    boolean hasHair;

    public Person(boolean hasFur, Integer height, Integer weight, String SSN, Integer Intelligence, boolean hasHair){
        super(hasFur, height, weight);
        this.SSN = SSN;
        this.Intelligence = Intelligence;
        this.hasHair = hasHair;
    }

    @Override
    public void announce(){
        System.out.println("Hi how's it going?");
    };
}
