package base;

public abstract class Mammal {
    boolean hasFur;
    boolean hasVertabae;
    Integer height;
    Integer weight;
    boolean giveBirth;

    public Mammal(boolean hasFur, Integer height, Integer weight) {
        this.hasFur = hasFur;
        this.hasVertabae = true;
        this.height = height;
        this.weight = weight;
        this.giveBirth = true;
        announce();
    }

    public abstract void announce();
}
