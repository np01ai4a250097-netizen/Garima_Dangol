package Week6;

/**
 * Write a description of class seates here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class seats
{
    public static void main(String[]arg){
        String [][]seats=new String[2][3];
        seats[0][0]="Ram";
        seats[0][1]="Hari";
        seats[0][2]="Sita";

        System.out.println("Seating Chart:");
        for(int i=0; i<seats.length; i++)
        {
            for(int j=0;j<seats[i].length; j++)
            {
                if(seats[i][j]== null){
                    System.out.print("[Empty]\t");
                }
                else {
                    System.out.print(seats[i][j] + "\t");
                }
                
            }
            System.out.println();
        }

    }
}