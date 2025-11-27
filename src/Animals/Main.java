package Animals;

public class Main {
    public static void main() {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Nikki", 5, "Carnivora");
        animal[1] = new Dog("Molly", 5, 18,"Carnivora","Golden retriever");
        animal[2] = new Bird("Arak", 2, 1, "White");
        animal[3] = new Pigeon("Kinder", 2, 1, "black", "homing pigeon" );
        animal[4] = new Fish("Kuma", 1, 3, "Mixed");
        animal[5] = new Blowfish("Kuka", 2, 1);

        for (Animal a : animal) {
            System.out.println(a.toString());
            AnimalName.name(a.getName());
            System.out.println("Voice: " + a.getVoice());
            a.eat();
            a.move();
            System.out.println();
        }

        AnimalBehaviour[] animalBehavior = new AnimalBehaviour[]{
                new Dog("Baki", 3, 15, "Carnivora", "Beagle"),
                new Pigeon("Kris", 1, 0, "Grey", "Homing Pigeon"),
                new Blowfish("John", 1, 1, "Yellow", 3)
        };

        for (int i = 0; i < animalBehavior.length; i++) {
            System.out.print("Behaviour index " + i + ": ");
            animalBehavior[i].sleep();
        }
    }
}