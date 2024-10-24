class Book{
    private String title;
    private String author;
    private int publicationYear;
    private String publisher;
    private String category;

    public Book(String title, String author, int publicationYear, String publisher, String category) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.category = category;
    }

    public void printDetails(){
        System.out.println("Book Details\n");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Publisher: " + publisher);
        System.out.println("Category: " + category);
    }

}

public class Main{
    public static void main(String[] args){
        Book book1 = new Book("Buku Resep Masak", "Chef Hyunjin", 2020, "JYP", "Non Fiction");
        book1.printDetails();
    }
}

