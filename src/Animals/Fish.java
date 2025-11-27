package Animals;
public class Fish extends Animal{
    private String scaleColor;
    public Fish() {
        super();
        this.scaleColor = "red";
    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, int weight, String scaleColor) {
        super(name, weight);
        this.scaleColor = scaleColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats fish food.");
    }

    @Override
    public String getVoice() {
        return "Blub blub";
    }

    public String getscaleColor() { return scaleColor; }
    public void setscaleColor(String scaleColor) { this.scaleColor = scaleColor; }

    @Override
    public String toString() {
        return super.toString() + " | scaleColor: " + scaleColor;
    }
}