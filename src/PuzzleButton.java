import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PuzzleButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int number;
	
	public PuzzleButton() {
		super();
		initUI();
	}
	
	public PuzzleButton(ImageIcon imageIcon) {
		super(imageIcon);
		initUI();
	}
	
	private void initUI() {
	}

}
