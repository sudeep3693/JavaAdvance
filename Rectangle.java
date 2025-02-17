public class Rectangle {
    
    public static void main(String args[])
    {

        int length=6, width = 6;
        for(int i = 1;i<=width;i++ )
        {
            for(int j = 1;j<=length;j++)
            {
                if(i==1||i==length)
                {
                    System.out.print("-");

                   
                }
                else{
                    System.out.print(" ");
                }
                if(j==1||j==width)
                {
                    System.out.print("|");
                    
                }
                else{
                    System.out.print(" ");
                }
               
                
            }
            System.out.println();
        }
    }
}
