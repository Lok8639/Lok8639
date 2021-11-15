import java.awt.*;
import java.applet.*;
public class Animate1 extends Applet
{
	public void paint(Graphics g)
	{
		Image img1=getImage(getDocumentBase(),"img1.gif");
		Image img2=getImage(getDocumentBase(),"img2.gif");
		Image img3=getImage(getDocumentBase(),"img3.gif");
		for(;;)
		{
			try{
				g.drawImage(img1,50,50,null);
				Thread.sleep(500);
				g.drawImage(img2,50,50,null);
				Thread.sleep(500);
				g.drawImage(img3,50,50,null);
				Thread.sleep(500);
				g.drawImage(img2,50,50,null);
				Thread.sleep(500);
			    }
			catch(InterruptedException ie)
			{
			}
		}
	}
}
/*<html>
	<applet code="Animate1.class" height=1000 width=1000>
	</applet>
</html> */
