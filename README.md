
import java.awt.*;
import java.applet.*;
public class Animate extends Applet
{
	public void paint(Graphics g)
	{
		Image img=getImage(getDocumentBase(),"plane.gif");
		
		for(int x=0;x<=800;x++)
		{
			g.drawImage(img,x,0,null);
			try{
				Thread.sleep(20);
			    }
			catch(InterruptedException e)
			{
			}
		}
	}
}
/* <html>
	<applet code="Animate.class" height=800 width=1300>
	</applet>
   </html> */
