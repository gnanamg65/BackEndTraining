package Day2;
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
