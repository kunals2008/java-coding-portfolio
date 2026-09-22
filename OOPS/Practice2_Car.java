class Car {
    String brand;
    String color;
  int year;
    void displayCar() {
        System.out.println("Brand: " + brand);
     System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}
public class Practice2_Car {
    public static void main(String[] args) {
      Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.year = 2024;
        car1.displayCar();
    }
}
