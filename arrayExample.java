import java.util.*;
import javax.swing.*;
public class arrayExample {
    
    /**
     * @param args
     */
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        List<String> fruits = new ArrayList();
        String f[] = new String[10];
        System.out.println("Adding into array: ");

        System.out.println("enter 5 fruits name: ");

       for(int i = 1;i<=5;i++)
       {
        f[i] = sc.nextLine();
       }

   for(int i =1;i<=5;i++)
   {
    fruits.add(f[i]);
   }

   System.out.println("poping from array");

   for(String i : fruits)
   {
    System.out.println(i);
   }



   System.out.println("Search in array: ");

   System.out.println("enter what you want to search: ");
   String searchdata = sc.nextLine();

   Boolean b = false;

   for(String i: fruits)
   {
    if(i.matches(searchdata))
    {
        
        b = true;
        break;
    }
    else{
        
        b = false;
    }
   }
   if(b==true)
   {
    System.out.println("Here we found your search in the array list: ");
   }
   else
   {
    System.out.println("Sorry, your search is not found in array ");
   }


   System.out.println();
   System.out.println();
   System.out.println();

   System.out.println(" adding new fruit in array: ");

   System.out.println("Enter what you want to add in array");
   String newadd = sc.nextLine();

   fruits.add(newadd);

   System.out.println();
   System.out.println();
   System.out.println();

   System.out.println("what you want to remove: ");
   String removes = sc.nextLine();

   fruits.remove(removes);

   System.out.println();
   System.out.println();
   System.out.println();

   System.out.println("after adding and deleting the data");

   for(String i : fruits)
   {
    System.out.println(i);
   }
    }
}
