class Employee {
    String name;
    int id;
    double salary;

    void displayEmployee() {
        System.out.println("Name  : " + name);
        System.out.println("ID: " + id);
		
        System.out.println("Salary: $" + salary);
    }
}
public class Practice4_Employee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name =   "Alex";
        employee1.id =   101;
        employee1.salary = 45000;
        employee1.displayEmployee();
    }
}
