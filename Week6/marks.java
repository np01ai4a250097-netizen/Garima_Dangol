package Week6;

/**
 * Write a description of class marks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class marks
{

    public static void main(String[]arg){
        int [][]marks= new int[2][2];
        marks[0][0]=85;
        marks[0][1]=90;
        marks[1][0] = 95;
        marks[1][1] = 88;

        System.out.println("Marks Table:");
        System.out.println("Student\t\tNepali\tEnglish\tTotal");

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            System.out.print("Student " + (i + 1) + "\t");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];

               
            }
             System.out.println(total);
        }}
}