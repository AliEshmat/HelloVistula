import java.util.Random;

public class minmax {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        System.out.println("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
            System.out.println(numbers[i]+"");

        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

}
