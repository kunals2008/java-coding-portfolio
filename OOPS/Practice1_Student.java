class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age:"+    age);
    }
}

public class Practice1_Student {
    public static void main(String[] args) {
      Student student1 = new Student();
        student1.name = "John ";
        student1.age = 18 ;
		
		
        student1.displayInfo();
    }
}
