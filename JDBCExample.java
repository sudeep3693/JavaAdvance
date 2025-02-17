import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class JDBCExample extends JFrame
{

    JFrame j;
    JLabel l1,l2,l3;
    JTextField t1;
    JButton b1,b2;
    Connection con;

    JDBCExample()
    {
        j = new JFrame("Example for jdbc");
        j.setSize(600,600);
        j.setLayout(null);
        j.setVisible(true);

        t1 = new JTextField();
        t1.setBounds(350,50,150,50);
        j.add(t1);

        l1 = new JLabel("Enter text");
        l1.setBounds(50,50,150,50);
        j.add(l1);

        l2 = new JLabel("Your output is: ");
        l2.setBounds(50,350,150,50);
        j.add(l2);

        l3 = new JLabel();
        l3.setBounds(350,350,150,50);
        j.add(l3);


        b1 = new JButton("Submit");
        b1.setBounds(150,150,100,50);
        j.add(b1);

        b2 = new JButton("view result");
        b2.setBounds(150,450,100,50);
        j.add(b2);

    }

    String driver = "com.mysql.cj.jdbc.Driver";
    public void connectDatabase()
    {
        try{
        Class.forName(driver);
        
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SUDEP","DATA","Sudeep@369");
            System.out.println("database connnected successfully");
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    public static void main(String args[])
    {
      JDBCExample jd =   new JDBCExample();
      jd.connectDatabase();
    }
}