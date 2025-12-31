package Week6;


/**
 * Write a description of class Hello here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hello
{
    public static void main(String[]arg)
    {
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter how many names do you want: ");
       int numberOfStudents=sc.nextInt();
       sc.nextInt(); //to avoid the empty input in this loop
       String[] names= new String[numberOfStudents];
       
       for(int i=0; i<numberOfStudents; i++){
       System.out.println("Enter the name : ");
       //String name= sc.nextLine();
       //names[i] = name;
       names[i] = sc.nextLine();
    }
        
        
       //String []name= {"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
       //Sysem.out.println(Arrays.toString(names)); also prints names
       //for(int i=0; i<name.length; i++)
       //{
         // System.out.println(name[i]);
       //}
       //System.out.println("Name at index 2 is "+name[2]);
       //name[4]="Hari";
       //for(int i=0; i<name.length; i++)
       //{
         // System.out.println(name[i]);
       //}
       //System.out.println(name[4]);
       
      
}