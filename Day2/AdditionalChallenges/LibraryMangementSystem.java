//Create a program to manage a library system using OOP concepts, including classes for Book, Member, and Librarian.

package Day2.AdditionalChallenges;
import java.util.*;
import java.util.ArrayList;
// complete the below for library management system
class Books{

private String BookName;
private String Author;
private String ISBN;
 boolean booked;
 private String bookedBy;

public Books(String BookName,String Author,String ISBN,boolean booked){
    this.BookName=BookName;
    this.Author=Author;
    this.ISBN=ISBN;
    this.booked=booked;
    this.bookedBy="";
}
public String getBookName(){
    return BookName;
}
public  String getBookedBy(){
    return  bookedBy;
}
public boolean setBookedBy(String id){
    bookedBy=id;
    return true;
}
public String getAuthor(){
    return Author;
}
public String getISBN(){
    return ISBN;
}
}

class Member{

private String MemberName;
private String MemberID;
private List<Books>BorrowedBooks;


public Member(String MemberName,String MemberID){
    this.MemberName=MemberName;
    this.MemberID=MemberID;
    BorrowedBooks=new ArrayList<>();
}
public String getMemberName(){
    return MemberName;
}

    public String getMemberID() {
        return MemberID;
    }
    public List<Books> getBorrowedBooks(){
    return BorrowedBooks;
    }

    public void setBorrowedBooks(List<Books> borrowedBooks) {
        BorrowedBooks = borrowedBooks;
    }
    public void borrowBook(Books book){
    BorrowedBooks.add(book);
    }
}

class Librarian{
private String LibrarianName;
private String LibrarianId;
public Librarian(String LibrarianName,String LibrarianId){
    this.LibrarianName=LibrarianName;
    this.LibrarianId=LibrarianId;
}
public String getLibrarianName(){
    return LibrarianName;
}
public String getLibrarianId(){
    return LibrarianId;
}
}

public class LibraryMangementSystem {

    ArrayList<Member>memberList=new ArrayList<>();
    ArrayList<Books>bookList=new ArrayList<>();

    public void createUser(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the user name : ");
        String name=s.nextLine();
        System.out.println("Enter the user id : ");
        String id=s.nextLine();
        memberList.add(new Member(name, id));
    }

    public  void createBook(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the book Name:");
        String Title=s.nextLine();
        System.out.println("Enter the Author Name:");
        String Author=s.nextLine();
        System.out.println("Enter the ISBN:");
        String ISBN=s.nextLine();
        bookList.add(new Books(Title,Author,ISBN,false));

    }
    public void LibrarianDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Librarian Name:");
        String Name= sc.nextLine();
        System.out.println("Enter the Librarian Id:");
        String id= sc.nextLine();
    }

    public void borrowBook(){
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the Member ID:");
        String id=s.nextLine();
        System.out.println("Enter the Book ISBN:");
        String ISBN=s.nextLine();
        for(Member m:memberList){
            if(m.getMemberID().equals(id)){

                for(Books b:bookList) {
                    if (!b.booked) {
                        m.borrowBook(b);
                        if (b.getISBN().equals(ISBN)) {
                            b.booked = true;

                            if (b.setBookedBy(id)) {
                                System.out.println("Booked Successfully!...");
                            }
                        }
                    }
                }
            }
        }
    }
public void printAllUser() {
    for (Member m : memberList) {
        System.out.println("UserId: "+m.getMemberID() +" "+"UserName: "+ m.getMemberName());
        //System.out.println("Borrowed Books");
        for(Books b:m.getBorrowedBooks()){
            System.out.println("Borrowed User Details:");
            System.out.println("MemberId:"+m.getMemberID()+"BookId: "+b.getBookedBy());
        }
    }


}
    public void printAllBook(){
        for(Books b:bookList){
            System.out.println("BookName: "+b.getBookName()+" "+"BookISBN: "+b.getISBN()+"Booked: "+b.booked);
        }
}
    public static void main(String[] args) {
        LibraryMangementSystem lms=new LibraryMangementSystem();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1.Create User");
            System.out.println("2.Create Book");
            System.out.println("3.Borrow Book");
            System.out.println("4.PrintAllUser");
            System.out.println("5.PrintAllBook");
            System.out.println("6.Exit");
            int choice =sc.nextInt();
            switch (choice){
                case 1:
                    lms.createUser();
                    break;
                case 2:
                    lms.createBook();
                    break;
                case 3:
                    lms.borrowBook();
                    break;
                case 4:
                    lms.printAllUser();
                    break;
                case 5:
                    lms.printAllBook();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }

        }

    }
}
