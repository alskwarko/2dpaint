import java.awt.*;
import javax.swing.*;

public class Frame2D {

	public static void main(String[] args) {
		JFrame jf = new JFrame("House");
		jf.setSize(800, 600);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.add(new Board());
	}
}

class Board extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	private void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setPaint(Color.cyan);
		int W = getWidth();
		int H = getHeight();
		g2d.fillRect(0, 0, W, H);
		g2d.setPaint(Color.green);
		g2d.fillRect(0, H - 120, W, 120);
		g2d.setPaint(Color.orange);
		int w = 100;
		int h = 100;
		g2d.fillOval(10, 10, w, h);
		g2d.setPaint(Color.darkGray);
		g2d.fillRect(W - 130, H - 180, 20, 60);
		g2d.setPaint(Color.GREEN.darker());
		g2d.fillOval(W - 200, H - 470, 150, 300);
		
		g2d.setPaint(Color.lightGray);
		g2d.fillRect(200, 200, 240, 245);
		g2d.setPaint(Color.white);
		g2d.fillRect(280, 280, 80, 80);
		g2d.setPaint(Color.darkGray);
		g2d.drawLine(280, 310, 360, 310);
		g2d.drawLine(320, 310, 320, 360);

		   int nPoints = 3;
		   int[] xPoints = new int[nPoints+1];
		   int[] yPoints = new int[nPoints+1];
		   for(int i=0; i<nPoints; i++)
		   {
		       double angle = 2*Math.PI *i/nPoints;
		       xPoints[i] = (int)(320+ 180*Math.sin(angle));
		       yPoints[i] = (int)(180 - 80*Math.cos(angle));
		   }
	
		   g2d.setPaint(Color.darkGray);

		   g2d.fillPolygon(xPoints, yPoints, nPoints);
	

		   g2d.fillPolygon(xPoints, yPoints, nPoints);
		   repaint();
	}
}


