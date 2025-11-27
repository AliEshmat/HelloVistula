package Animals;

public class Mammal extends Animal{
    private String order;
    public Mammal() {
        super();
        this.order = "mammal";
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(String name, int weight, String order) {
        super(name, weight);
        this.order = order;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats mammal food.");
    }

    @Override
    public String getVoice() {
        return "Mammal sound";
    }

    public String getorder() { return order; }
    public void setorder(String order) { this.order= order; }

    @Override
    public String toString() {
        return super.toString() + " | order: " +order;
    }
}