import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeylistenerEg extends KeyAdapter
{

    JFrame j;
    JTextField t;
    KeylistenerEg()
    {
        j = new JFrame("KeyListenerEg");
        j.setSize(600,600);
        j.setLayout(null); 
        
        t = new JTextField();
        t.setBounds(100,100,150,40);
        t.addKeyListener(new KeyAdapter() 
            {
                public void keyPressed(KeyEvent e)
                {
                    System.out.println("Hello key pressed");
                }
            }
        );
        j.add(t);
        

        j.setVisible(true);
    }

    

   
    public static void main(String args[])
    {
            new KeylistenerEg();

    }
}