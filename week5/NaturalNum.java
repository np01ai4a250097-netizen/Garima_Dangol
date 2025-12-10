package week5;

/**
 * Write a description of class NaturalNum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NaturalNum
{
    public static void main(String[]arg){

        for(int i=1; i<=10; i++){
            int squar=i*i;
            System.out.println(squar+"\t");
        }

        int a=1;
        while(a<=10){
            int squar=a*a;
            System.out.println(squar+"\t");
            a++;
        }

        int b=1;
        do{
            int squar=b*b;
            System.out.println(squar+"\t");
            b++;
        }while(b<=10);    

    }
}