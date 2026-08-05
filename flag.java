import java.applet.*;
import java.awt.*;

//<applet code="flag" width="600" height="400">
//</applet>

public class flag extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.orange);
		g.fillRect(0,0,500,100);
		
		g.setColor(Color.white);
		g.fillRect(0,100,500,100);
		
		g.setColor(Color.green);
		g.fillRect(0,200,500,100);
		
		g.setColor(Color. blue);
		g.drawOval(200,100,100,100);
		
		
	}

}

