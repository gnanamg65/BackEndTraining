//Default Constructor:
//Create a class Book with default values for title and author. Write a default constructor to initialize these attributes.
package Day2.Constructors;
public class Book {
    private final String Title;
    private final String Author;
    Book(){
       Title="Wing of Fire";
        Author="APJ Abdul Kalam";

    }
    void display(){
        System.out.println("Title:"+Title);
        System.out.println("Author"+Author);
    }

    public static void main(String[] args) {
        Book book=new Book();
        book.display();
    }
}
