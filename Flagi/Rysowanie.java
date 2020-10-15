import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Rysowanie extends JComponent {		
		@Override
		protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D flag = (Graphics2D) g;
		flag.drawRect(120, 80,160,50);
		flag.drawRect(120,130,160,50);
		flag.setColor(new Color(233,232,231));
		flag.fillRect(120,80,160,50);
		flag.setColor(new Color(212,33,61));
		flag.fillRect(120,130,160,50);
		}
}

