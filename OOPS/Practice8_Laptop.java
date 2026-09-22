class Laptop {
    String brand;
    int ram;
    double price;

    void displayLaptop() {
        System.out.println("Brand11111: " + brand);
        System.out.println("RAM2222: " + ram + " GB");
        System.out.println("Price: $" + price);
    }
	}



public class Practice8_Laptop 
	{
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Dell";
        laptop1.ram = 16;
        laptop1.price = 799.99;
        laptop1.displayLaptop();
    }
}
