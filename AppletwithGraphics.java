//Applet with graphics
import java.applet.*;
import java.awt.*;
import java.util.*;

public class AppletwithGraphics extends Applet{

    public void paint(Graphics g)
    {
        g.drawLine((int)50,(int)50,(int)150,(int)150);

        g.drawRect(200,200,300,300);
        
    }
}
/*
 <applet code="AppletwithGraphics.class"
 width="600"
 height="600">
 </applet>
 */