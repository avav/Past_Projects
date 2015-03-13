package LogGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LG implements ActionListener{
	JFrame frame;
	JPanel contentPane;
	JButton b0, b1, b2, b3, b4, b5, b6;
	JLabel p0, p1, p2, p3, p4, p5, p6;
	Icon guy = new ImageIcon("guy.gif");
	Icon girl = new ImageIcon("girl.gif");
	Icon spot = new ImageIcon("space.gif");
	Icon gender = new ImageIcon();
	int moves = 0;
	
	public LG() {

		/* Create and set up the frame */
		frame = new JFrame ("Log Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*Create a content pane with a GridLayout */
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(2, 6, 0, 0));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
		
		/* Create and add button with boy image */
		b0 = new JButton(guy);
		b0.setActionCommand("b0");
		b0.addActionListener(this);
		contentPane.add(b0);
		
		/* Create and add button with boy image */
		b1 = new JButton(guy);
		b1.setActionCommand("b1");
		b1.addActionListener(this);
		contentPane.add(b1);
		
		/* Create and add button with boy image */
		b2 = new JButton(guy);
		b2.setActionCommand("b2");
		b2.addActionListener(this);
		contentPane.add(b2);

		/* Create and add button with empty image */
		b3 = new JButton(spot);
		b3.setActionCommand("x");
		b3.addActionListener(this);
		contentPane.add(b3);
		
		/* Create and add button with girl image */
		b4 = new JButton(girl);
		b4.setActionCommand("b4");
		b4.addActionListener(this);
		contentPane.add(b4);
		
		/* Create and add button with girl image */
		b5 = new JButton(girl);
		b5.setActionCommand("b5");
		b5.addActionListener(this);
		contentPane.add(b5);
		
		/* Create and add button with girl image */
		b6 = new JButton(girl);
		b6.setActionCommand("b6");
		b6.addActionListener(this);
		contentPane.add(b6);
		
		/* Create a labels that show the log*/
		p0 = new JLabel( new ImageIcon("1.jpg"));
		contentPane.add(p0);
		
		p1 = new JLabel( new ImageIcon("2.jpg"));
		contentPane.add(p1);
		
		p2 = new JLabel( new ImageIcon("3.jpg"));
		contentPane.add(p2);
		
		p3 = new JLabel( new ImageIcon("4.jpg"));
		contentPane.add(p3);
		
		p4 = new JLabel( new ImageIcon("5.jpg"));
		contentPane.add(p4);
		
		p5 = new JLabel( new ImageIcon("2.jpg"));
		contentPane.add(p5);
		
		p6 = new JLabel( new ImageIcon("6.jpg"));
		contentPane.add(p6);
		
		/* Add content pane to frame */
		frame.setContentPane(contentPane);
		
		/* Size and then display the frame. */
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();

		if (eventName.equals("x")) {
			moves -= 1;
		} else if (eventName.equals("b0")) {
			gender = b0.getIcon();
			if (validMove(0, gender)) {
				b0.setIcon(spot);
				b0.setActionCommand("x");
			} else {
				moves -= 1;
			}
		} else if (eventName.equals("b1")) {
			gender = b1.getIcon();
			if (validMove(1, gender)) {
				b1.setIcon(spot);
				b1.setActionCommand("x");
			} else {
				moves -= 1;
			}
		} else if (eventName.equals("b2")) {
			gender = b2.getIcon();
			if (validMove(2, gender)) {
				b2.setIcon(spot);
				b2.setActionCommand("x");
			} else {
				moves -= 1;
			}
		} else if (eventName.equals("b3")) {
			gender = b3.getIcon();
			if (validMove(3, gender)) {
				b3.setIcon(spot);
				b3.setActionCommand("x");
			} else {
				moves -= 1;
			}
		} else if (eventName.equals("b4")) {
			gender = b4.getIcon();
			if (validMove(4, gender)) {
				b4.setIcon(spot);
				b4.setActionCommand("x");
			} else {
				moves -= 1;
			}
		} else if (eventName.equals("b5")) {
			gender = b5.getIcon();
			if (validMove(5, gender)) {
				b5.setIcon(spot);
				b5.setActionCommand("x");
			} else {
				moves -= 1;
			}
		} else if (eventName.equals("b6")) {
			gender = b6.getIcon();
			if (validMove(6, gender)) {
				b6.setIcon(spot);
				b6.setActionCommand("x");
			} else {
				moves -= 1;
			}
		} 
		
		if (moves < 0) {
			moves = 0;
		} else {
			moves += 1;
		}
		
		if (complete()) {
			p0.setText("Congrats!");
			p1.setText("You made ");
			p2.setText(moves + " moves.");
		}
	}
	
	boolean validMove(int command, Icon button) {
		int range;
		int space = -1;
		
		/* Find the button containing the space */
		if (b0.getIcon() == spot) {
			space = 0;
		} else if (b1.getIcon() == spot) {
			space = 1;
		} else if (b2.getIcon() == spot) {
			space = 2;
		} else if (b3.getIcon() == spot) {
			space = 3;
		} else if (b4.getIcon() == spot) {
			space = 4;
		} else if (b5.getIcon() == spot) {
			space = 5;
		} else if (b6.getIcon() == spot) {
			space = 6;
		} 
		
		range = space - command;
		if (range >= -2 && range <= 2 && range != 0) {
			if (space == 0) {
				b0.setIcon(button);
				b0.setActionCommand("b0");
			} else if (space == 1) {
				b1.setIcon(button);
				b1.setActionCommand("b1");
			} else if (space == 2) {
				b2.setIcon(button);
				b2.setActionCommand("b2");
			} else if (space == 3) {
				b3.setIcon(button);
				b3.setActionCommand("b3");
			} else if (space == 4) {
				b4.setIcon(button);
				b4.setActionCommand("b4");
			} else if (space == 5) {
				b5.setIcon(button);
				b5.setActionCommand("b5");
			} else if (space == 6) {
				b6.setIcon(button);
				b6.setActionCommand("b6");
			} 
			return (true);
		} else {
			return (false);
		}
	}	
		
	private boolean complete() {

		if (b0.getIcon() == girl && b1.getIcon() == girl && b2.getIcon() == girl &&
				b4.getIcon() == guy && b5.getIcon() == guy && b6.getIcon() == guy) {
			return (true);
		} else {
			return (false);
		}
		
	}
	
	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		LG game = new LG();
	}
	
	public void start() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
		
	}
}
