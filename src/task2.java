class Car {
    private String model;
    private String brand;
    private String color;
    private int year;
    private int price;
    private int quantity;

    public Car(String model, String brand, String color, int year, int price, int quantity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        }public void delivery(int number) {
        this.quantity += number;
        System.out.println(number + " cars delivered. New quantity: " + quantity);
    }

    public void sell(int number) {
        if (number <= quantity) {
            this.quantity -= number;
            System.out.println(number + " cars sold. Remaining quantity: " + quantity);
        } else {
            System.out.println("Not enough cars in stock!");
        }
    }
    @Override
    public String toString() {
        return "Car Details:\n" +
                "Model: " + model + "\n" +
                "Brand: " + brand + "\n" +
                "Color: " + color + "\n" +
                "Year: " + year + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity;
    }
}

public class task2 {public static void main(String[] args) {
    Car car1 = new Car("RS6","AUDI","BLACK",2016,250000,10);

    System.out.println(car1.toString());

    car1.sell(3);

    System.out.println("\nAfter selling cars:");
    System.out.println("Model: " + car1.getModel());
    System.out.println("Brand: " + car1.getBrand());
    System.out.println("Color: " + car1.getColor());
    System.out.println("Year: " + car1.getYear());
    System.out.println("Price: " + car1.getPrice());
    System.out.println("Quantity: " + car1.getQuantity());

    car1.setColor("Blue");
    car1.setPrice(230000);

    car1.delivery(5);

    System.out.println("\nAfter updates:");
    System.out.println(car1.toString());
}

}


