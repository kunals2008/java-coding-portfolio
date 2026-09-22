class Book {
    String title;
    String author;
    double price;

    void displayBook() {
        System.out.println("Titlessa : " + title);
        System.out.println("Authorrr: " + author);
        System.out.println("Price: $" + price);
    }
}
public class Practice3_Book {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "JavaBasics";
        book1.author = "James123";
        book1.price = 19.99;
        book1.displayBook();
    }
}
