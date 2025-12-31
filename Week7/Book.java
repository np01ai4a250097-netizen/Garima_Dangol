package Week7;

/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    String title;
    String author;
    double price;

    void open(){
        System.out.println("The book is open.");
    }

    void close(){
        System.out.println("The book is close.");
    }

    void read(){
        System.out.println("The book is being read.");
    }

    public static void main(String[]arg){

        Book b= new Book();
        b.title="Harry Potter";
        b.author="Jk.Rowling";
        b.price=800;

        Book b1= new Book();
        b1.title="Hunger Games";
        b1.author="Suzanne Collines";
        b1.price=800;

        System.out.println("The title of the book is"+b.title);
        System.out.println("The name of the Author is"+b.author);
        System.out.println("The price of the book is"+b.price);

        System.out.println("The title of the book is"+b1.title);
        System.out.println("The name of the Author is"+b1.author);
        System.out.println("The price of the book is"+b1.price);

        b.close();
        b.open();
        b.read();
        
        b1.close();
        b1.open();
        b1.read();
        
        
    }
}