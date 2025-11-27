package Animals;

public class Blowfish extends Fish implements AnimalBehaviour   {
    private int diameter;
    public Blowfish() {
        super();
        this.diameter = 4;
    }

    public Blowfish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, String.valueOf(diameter));
        this.diameter = diameter;
    }

    public Blowfish(String name, int weight, int diameter) {
        super(name, weight, "yellow");
        this.diameter = diameter;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats small sea organisms.");
    }

    @Override
    public String getVoice() {
        return "Puff, bubbles!";
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Blowfish) rests near the bottom.");
    }

    @Override
    public void move() {
        System.out.println(getName() + ", the Blowfish swims.");
    }

    public int getDiameter() { return diameter; }
    public void setDiameter(int diameter) { this.diameter = diameter; }

    @Override
    public String toString() {
        return super.toString() + " | diameter: " + diameter;
    }
}
