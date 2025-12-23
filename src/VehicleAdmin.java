public class BookStore {
    // Fixed-size arrays as requested (size 10) [cite: 91]
    private PriceAdmin[] books = new PriceAdmin[10];
    private Member[] members = new Member[10];

    private int bookCount = 0;
    private int memberCount = 0;

    // Method to add a book
    public void addBook(PriceAdmin book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Cannot add book. Inventory full.");
        }
    }

    // Method to add a member
    public void addMember(Member member) {
        if (memberCount < members.length) {
            members[memberCount] = member;
            memberCount++;
        } else {
            System.out.println("Cannot add member. List full.");
        }
    }

    // Method to display all books
    public void displayBooks() {
        System.out.println("\n--- Available Books ---");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayInfo();
        }
    }

    // THE MAIN LOGIC: Purchase Book [cite: 91]
    public void purchaseBook(int memberId, String bookTitle) {
        Member buyer = null;
        PriceAdmin targetBook = null;

        // 1. Find the member
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId() == memberId) {
                buyer = members[i];
                break;
            }
        }

        // 2. Find the book
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(bookTitle)) {
                targetBook = books[i];
                break;
            }
        }

        // 3. Validation and Processing
        if (buyer == null) {
            System.out.println("Transaction Failed: Member ID " + memberId + " not found.");
            return;
        }

        if (targetBook == null) {
            System.out.println("Transaction Failed: Book '" + bookTitle + "' not found.");
            return;
        }

        if (targetBook.getQuantity() <= 0) {
            System.out.println("Transaction Failed: '" + bookTitle + "' is out of stock.");
            return;
        }

        // 4. Calculate Final Price (Polymorphism in action)
        double price = targetBook.getPrice();
        double discount = buyer.calculateDiscount(price); // Calls the specific version based on member type
        double finalPrice = price - discount;

        // 5. Update stock and print receipt
        targetBook.setQuantity(targetBook.getQuantity() - 1);

        System.out.println("\n--- Receipt ---");
        System.out.println("Member: " + buyer.getName());
        System.out.println("Book: " + targetBook.getTitle());
        System.out.println("Original Price: $" + price);
        System.out.println("Discount Applied: -$" + discount);
        System.out.println("Total Paid: $" + finalPrice);
        System.out.println("-----------------");
    }
}