
import java.util.Scanner;
public class pascalTriangle {


    Triangle(int h)
    {
        int a=0,b=1,c=0;
        int p=0,q=0;

        for(int i = 1;i<=h;i++);
        {
            for(int j = 1;j<=h-i;j++);
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++)
            {
                while(p<=i || q<=j)
                {
                    a = 
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int height;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the height of pascal triangle: ");
        height = sc.nextInt();

        Triangle(height);

    }
}
