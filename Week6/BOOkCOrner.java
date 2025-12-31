package Week6;


/**
 * Write a description of class BOOkCOrner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BOOkCOrner
{
    public static void main(String[]arg){
        String[] categories = {"Fiction", "Nepali"};
String[][] title = new String[2][1];
int[][] price = new int[2][1];


title[0][0] = "Asahamati - 5";
        price[0][0] = 750;
        
        title[1][0] = "Muna Madan";
        price[1][0] = 500;
        
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            
            for (int j = 0; j < title[i].length; j++) {
                System.out.println( "Title: " + title[i][j] +", Price: Rs " + price[i][j]);
        }
    }}
}