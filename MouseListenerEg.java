import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public  class MouseListenerEg implements MouseListener
{
    JFrame j;
    JLabel l,m;
    JButton b;
    JTextArea t,u;
    public static int count = 0;
    MouseListenerEg()
    {
        j=new JFrame("example");
        j.setSize(1000,1000);
        j.setVisible(true);
        j.addMouseListener(this);
        l = new JLabel("Email");
        m = new JLabel("password");
        b = new JButton("LOGIN");
        t = new JTextArea();
        u = new JTextArea();
        t.setBounds(400,200,150,50);
        u.setBounds(400,400,150,50);
        l.setBounds(200,200,150,50);
        m.setBounds(200,400,150,50);
        b.setBounds(500,300,150,50);
        j.add(l);
        j.add(m);
        j.add(b);
        j.add(t);
        j.add(u);
        j.setLayout(null);
    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse Exited");
    }
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse Released");
    }
    public void mouseClicked(MouseEvent e)
    {
        count++;
        System.out.println("Mouse Clicked " +count +" times");
    }
public static void main(String args[])
{
    new MouseListenerEg();
}
}