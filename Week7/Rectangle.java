package Week7;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    int length;
    int breadth;
    
    void sides(){
        System.out.println("Rectangle has four sides.");
    }
    void angle(){
        System.out.println("Rectangle has 90 degree angles on each side.");
    }
    public static void main(String[]arg){
        Rectangle r=new Rectangle();
        r.length=20;
        r.breadth=30;
        
        System.out.println("The length of Rectangle is "+r.length+"cm");
        System.out.println("The breadth of Rectangle is "+r.breadth+"cm");
        System.out.println("The area of Rectangle is "+r.length*r.breadth+"cm");
        
        Rectangle r1=new Rectangle();
        r1.length=80;
        r1.breadth=30;
        int area1= r1.length*r1.breadth;
        System.out.println("The length of Rectangle is "+r1.length+"cm");
        System.out.println("The breadth of Rectangle is "+r1.breadth+"cm");
        System.out.println("The area of Rectangle is "+area1+"cm");
        
        r.sides();
        r.angle();
        
        r1.sides();
        r1.angle();
        
    }
}