import  javax.swing.*;
import java.awt.*;

public class menueg
{
JFrame f;
JMenuBar mbar; 
JMenu file,edit, abc;
JMenuItem i1,i2,i3,i4,i5,i6,i7;

menueg()
{
 
    f=new JFrame("menu eg");
    f.setSize(500,500);
    f.setLocationRelativeTo(null);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JMenuBar mbar=new JMenuBar();
    file=new JMenu("FILE");
    edit=new JMenu("EDIT");
    abc = new JMenu("example");
    mbar.add(file);
     mbar.add(edit);
     f.setJMenuBar(mbar);
   
     JMenuItem i1=new JMenuItem("Open");
     JMenuItem i2=new JMenuItem("Save");
     JMenuItem i3=new JMenuItem("Save as");
     file.add(i1); 
     file.add(i2); 
     file.add(i3);
     file.add(abc);
    JMenuItem i4=new JMenuItem("Cut");
    JMenuItem i5=new JMenuItem("undo");
    edit.add(i4);
    edit.add(i5);

    // file ko open vitra ko open
    JMenuItem i6=new JMenuItem("Open with document");
    JMenuItem i7=new JMenuItem("Open with pictures");
    abc.add(i6);
    abc.add(i7);
    f.setVisible(true);
}
    public static void main(String args[])
    {
 new menueg();
    }
}