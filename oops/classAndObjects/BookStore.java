package oops.classAndObjects;

public class BookStore {
    String title;
    String author;
    double price;

    void display() {
        System.out.println(title + " by " + author + " - ₹" + price);
    }

    public static void main(String[] args) {
        BookStore[] books = new BookStore[3];

        books[0] = new BookStore();
        books[0].title = "Rich Dad Poor Dad";
        books[0].author = "Robert Kiyosaki";
        books[0].price = 499;

        books[1] = new BookStore();
        books[1].title = "Atomic Habits";
        books[1].author = "James Clear";
        books[1].price = 599;

        books[2] = new BookStore();
        books[2].title = "Clean Code";
        books[2].author = "Robert C. Martin";
        books[2].price = 799;

        System.out.println("=== Book Store Inventory ===");
        for (BookStore b : books) {
            b.display();
        }
    }
}
