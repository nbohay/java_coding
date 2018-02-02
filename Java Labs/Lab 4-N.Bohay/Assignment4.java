//Bohay, Nicholas
//Assignment 4 #32
import javax.swing.JApplet;
import java.awt.Graphics;

public class Assignment4 extends JApplet{
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawLine(0,66,99,66);
        g.drawLine(0,33,99,33);
        
        g.drawLine(33,0,33,99);
        g.drawLine(66,0,66,99);
        
        //draw o
        g.drawOval(0,0,33,33);
        g.drawOval(33,66,33,33);
        
        //draw x
        g.drawLine(66,0,99,33);
        g.drawLine(66,33,99,0);
        g.drawLine(33,0,66,33);
        g.drawLine(33,33,66,0);
        
}
}