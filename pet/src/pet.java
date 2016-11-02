import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class pet extends JFrame {
	public pet() {
		setTitle("Pet_97");
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		for (int i = 0; i < 20; i++) {
			add(new JButton(String.valueOf(i)));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pet pt = new pet();
		pt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}