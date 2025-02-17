import java.util.ArrayList;
import java.util.Scanner;
public class twodimentionalarray {
    
    public static void main(String args[])
    {
/* 
        String two [][] = new String[8][8];
        Scanner sc = new Scanner(System.in);
        int i,j;
        String car_name,car_model,car_price;
        for(i = 0;i<3; i++)
        {
            System.out.println("Please enter the details");
            
            for(j = 0;j<3;j++)
            {
                two[i][j] = sc.nextLine();
            }
        }
        */
        List<List<String>> dataa = new ArrayList<List<String>>();

        for(int i = 0; i<3;i++)
        {
            dataa.add(new ArrayList<String>());
        }

    }
}
