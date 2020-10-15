import java.awt.*;
import javax.swing.*;

class Relatywne extends JPanel {
	@Override
	public void reshape(int x, int y, int width, int height) {
		int currentWidth = getWidth();
		int currentHeight = getHeight();
		   if (currentWidth!=width || currentHeight!=height) {
		      if (currentWidth!=width && currentHeight!=height) {  
		         width = height = Math.max(width, height);
		      }
		      else if (currentWidth==width) {
		          width = height;
		      }
		      else 
		          height = width;
		   }
		super.reshape(x, y, width, height);
		}
}

