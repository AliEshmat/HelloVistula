package Animals;

public abstract class Animal implements AnimalMove{
    private String name;
    private int age;
    private int weight;

    public Animal(){ }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, int weight) {
        this.name = "akuma";
        this.age = 2;
        this.weight = weight;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }


    public abstract void eat();
    public abstract String getVoice();

    @Override
    public String toString() {
        return String.format("%s{name='%s', age=%d, weight=%d}",
                this.getClass().getSimpleName(), name, age, weight);
    }
}