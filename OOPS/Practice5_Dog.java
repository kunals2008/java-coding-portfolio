class Dokg {
    String name;
    String breed;

void bark() {
        System.out.println(name + " says: Woof Woof!");
    }

    void displayDog() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class Practice5_Dokg {
	
    public static void main(String[] args) {
        Dog dog1 = new Dokg();
        dog1.name = "Buddy";
		
		
        dog1.breed = "Golden Retriever";
        dog1.displayDog();
        dog1.bark();
    }
}
