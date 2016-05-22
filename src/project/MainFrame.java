package project;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
		
		
	}
	
	public MainFrame()
	{
		super("Mafia Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,600);
		setVisible(true);
	}
	
}
