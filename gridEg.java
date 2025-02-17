import javax.swing.*;
import java.awt.*;
public class gridEg
{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton b1,b2,b3;
    gridEg()
    {
        f = new JFrame("SudeepSubedi");
        f.setSize(600,600);
        f.setVisible(true);
l1 = new JLabel("L1");
l2 = new JLabel("L2");
l3 = new JLabel("L3");
l4 = new JLabel("L4");
l5 = new JLabel("L5");
l6 = new JLabel("L6");
l7 = new JLabel("L7");
b1 = new JButton("B1");
b2 = new JButton("B2");

f.setLayout(new GridLayout(3,3,15,15));
f.add(l1);
f.add(l2);
f.add(l3);
f.add(b1);
f.add(l4);
f.add(l5);
f.add(l6);
f.add(l7);
f.add(b2);
}
public static void main(String args[])
{
 new gridEg();
}
}
