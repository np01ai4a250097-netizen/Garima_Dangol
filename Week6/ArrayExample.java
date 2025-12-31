package Week6;

/**
 * Write a description of class ArrayExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayExample
{
    public static void main(String[]arg){
        int[]age; // array decleration
        age= new int[5]; // arrayconstruction

        age[0]=13;
        age[1]=15;
        age[2]=18;
        age[3]=21;
        age[4]=55;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);

        int []number=new int[5];
        int x =10;
        for(int i=0; i<number.length; i++ ) // or instead of number.length we can write 5
        {
            number[i]= x;
            x=x+10;

        }
        System.out.println("Display using loop" ); // printing the actual value hare does not print all the values
        for(int y=0; y<number.length; y++)
        {
            System.out.println(number[y]);
        }

    }

}