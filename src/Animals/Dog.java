package Animals;

public class Dog extends Mammal implements AnimalBehaviour{
    private String breed;
    public Dog() {
        super();
        this.breed = "Mixed";
    }

    public Dog(String name, int age, int weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    public Dog(String name, int weight, String breed) {
        super(name, weight, "dog");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Kibble.");
    }

    @Override
    public String getVoice() {
        return "Bark!";
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Dog) sleeps peacefully after playing.");
    }

    @Override
    public void move() {
        System.out.println(getName() + ", the Dog runs.");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return super.toString() + " | breed: " + breed;
    }
}