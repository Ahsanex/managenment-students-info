import java.util.Scanner;

class BookManagement {
    int[] title;    // Assuming title refers to some numeric code for the book
    String[] author;
    int[] year;

    // Method to input book details
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of bsooks you want to enter:");
        int numberOfBooks = sc.nextInt();
        sc.nextLine(); // Consume newline after the number

        // Initializb arrays based on the number of books
        title = new int[numberOfBooks];
        author = new String[numberOfBooks];
        year = new int[numberOfBooks];

        // 
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Enter details for book " + (i + 1) + ": ");
            System.out.print("Title (numeric code): ");
            title[i] = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Author: ");
            author[i] = sc.nextLine();
            System.out.print("Year: ");
            year[i] = sc.nextInt();
            sc.nextLine(); // Consume newline
        }

        sc.close(); // Close the scanner
    }

    // Display method to show book details
    void display() {
        for (int i = 0; i < title.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title (numeric code): " + title[i]);
            System.out.println("Author: " + author[i]);
            System.out.println("Year: " + year[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an object of the class
        BookManagement bm = new BookManagement();

        // Call input method to enter book details
        bm.input();

        // Call display method to show the book details
        bm.display();
    }
}
