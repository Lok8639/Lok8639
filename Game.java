import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gamedemo extends JApplet implements MouseMotionListener,MouseListener
{
	JButton b;
	JLabel lb1;
	static int score=0;
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(null);
		ImageIcon ii=new ImageIcon("fig.gif");
		b=new JButton("click me",ii);
		b.setFont(new Font("Helvetica",Font.BOLD,30));
		b.setBounds(400,300,250,75);
		c.add(b);
		lb1=new JLabel();
		
		lb1.setText("score:"+score);
		lb1.setBounds(550,20,150,50);
		c.add(lb1);
		b.addMouseMotionListener(this);
		b.addMouseListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		int x=(int)(600*Math.random());
		int y=(int)(500*Math.random());
		b.setBounds(x,y,250,75);
	}
	public void mouseMoved(MouseEvent me)
	{
		int x=(int)(600*Math.random());
		int y=(int)(500*Math.random());
		b.setBounds(x,y,250,75);
	}
	public void mouseClicked(MouseEvent e)
	{
		ImageIcon ii=new ImageIcon("fig1.gif");
		b.setIcon(ii);
		lb1.setForeground(Color.red);
		score+=100;
		lb1.setText("score:"+score);
	}
	public void mouseEntered(MouseEvent e)
	{
		int x=(int)(600*Math.random());
		int y=(int)(500*Math.random());
		b.setBounds(x,y,250,75);
	}
	public void mouseExited(MouseEvent e)
	{
		ImageIcon ii=new ImageIcon("fig.gif");
		b.setIcon(ii);
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
}
/*<html>
	<applet code="Gamedemo.class" height=900 width=900>
	</applet>
</html>*/
	
