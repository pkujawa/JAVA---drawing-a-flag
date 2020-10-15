import javax.swing.*;
import java.awt.*;

public class Flaga {
	public static void main(String[] args) {
		JFrame frame = getFrame();
	}

	private static JFrame getFrame() {
		JFrame frame = new JFrame("Polska");
		JPanel szachownica = new Relatywne();
		JLabel napis = new JLabel("Polska", JLabel.CENTER);
		
		frame.add(new Rysowanie());
		
		JLabel kwadrat1 = new JLabel();
        kwadrat1.setOpaque(true);
		kwadrat1.setBackground(new Color(212,33,61));
		JLabel kwadrat2 = new JLabel();
        kwadrat2.setOpaque(true);
		kwadrat2.setBackground(new Color(233,232,231));
		JLabel kwadrat3 = new JLabel();
        kwadrat3.setOpaque(true);
		kwadrat3.setBackground(new Color(233,232,231));
		JLabel kwadrat4 = new JLabel();
        kwadrat4.setOpaque(true);
		kwadrat4.setBackground(new Color(212,33,61));
		szachownica.add(kwadrat1);
		szachownica.add(kwadrat2);
		szachownica.add(kwadrat3);
		szachownica.add(kwadrat4);
		szachownica.setLayout(new GridLayout(2,2)); 

		frame.add(szachownica);

		frame.add(napis);
		frame.pack();
		frame.setLayout(new GridLayout(3, 1));
		frame.getContentPane().setBackground(new Color(51, 102, 255));
		
		frame.setSize(new Dimension(400, 900));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return frame;
	}
}
