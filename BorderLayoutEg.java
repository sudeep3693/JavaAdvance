import javax.swing.*;
import java.awt.*;

public class BorderLayoutEg
{
    JFrame j;
    JButton east,west,north,south,center;
    BorderLayoutEg()
    {
    j = new JFrame("BorderLayoutEg");
    east = new JButton("East");
    west = new JButton("West");
    north = new JButton("North");
    south = new JButton("South");
    center = new JButton("Center");
    j.setSize(800,800);
    j.setVisible(true);
    j.setLayout(new BorderLayout(10,1));
    j.add(east,BorderLayout.EAST);
    j.add(west,BorderLayout.WEST);
    j.add(north,BorderLayout.NORTH);
    j.add(south,BorderLayout.SOUTH);
    j.add(center,BorderLayout.CENTER);
    }
    public static void main(String args[])
    {
        new BorderLayoutEg();
    }
}