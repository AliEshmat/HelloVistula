package Animals;

public class Bird extends Animal {
    private String featherColor;
    public Bird() {
        super();
        this.featherColor = "grey";
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int weight, String featherColor) {
        super(name, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats bird food.");
    }

    @Override
    public String getVoice() {
        return "Chirp!";
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return super.toString() + " | featherColor: " + featherColor;
    }
}
