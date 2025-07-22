public class LibraryBookSystem {
    // Protected variables (so child classes can access them)
    public static class Book {
        protected String title;
        protected String author;
        protected int pages;
        protected boolean isAvailable;

        public  Book(String title, String author, int pages) {
            // Initialize all variables
            // Set isAvailable to true by default
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.isAvailable = true;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPages() {
            return pages;
        }

        // Basic methods
        public void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println(title + " has been borrowed.");
            } else {
                System.out.println(title + " is not available.");
            }
        }

        public void returnBook() {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        }

        public  void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Available: " + isAvailable);
        }

    }

    public static  class Textbook extends Book {
        private String subject;
        private int edition;

        // Constructor that calls parent constructor
        public Textbook(String title, String author, int pages, String subject, int edition) {
            super(title, author, pages);
            this.subject = subject;
            this.edition = edition;
        }

        // Override the displayInfo method
        // Display Textbook specific info
        @Override
        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Available: " + isAvailable);
            System.out.println("Subject: " + subject);
            System.out.println("Edition: " + edition);
        }

        public String getSubject() {
            return subject;
        }

        public int getEdition() {
            return edition;
        }
    }

    // Main class to test everything

    public static void main(String[] args) {
        // Create 2 regular books
        // Create 1 textbook
        // Test borrowing and returning
        // Display information for all books
        Book book1 = new Book("OMAN", "Me", 200);
        book1.displayInfo();
        book1.borrowBook();
        book1.returnBook();

        Textbook book2 = new Textbook("java", "cr7", 1000, "FB", 10);
        book2.displayInfo();
        book2.borrowBook();
        book2.returnBook();
        

    }

}
