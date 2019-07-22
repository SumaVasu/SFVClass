import java.awt.*;
import javax.swing.*;


public class SFVClass {
	
	private static void createWindow() {
		//Create and set up the window.
		JFrame frame = new JFrame("Simple GUI"); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,300);
		
		//Label
		JLabel textLabel = new JLabel("Welcome",SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(50, 20));
		frame.getContentPane().add(textLabel, BorderLayout.NORTH);
		
		
		//grid
		JPanel inPanel = new JPanel();
		
		GridLayout grid = new GridLayout(6, 3);
		grid.setHgap(3);
		
		inPanel.setLayout(grid);
		inPanel.setSize(400,400);
		inPanel.setBackground(Color.WHITE);
		inPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JLabel lNames = new JLabel("Names");
		lNames.setFont(new Font("Names",Font.BOLD,20));
		JLabel lRC = new JLabel("Present");
		lRC.setFont(new Font("Present",Font.BOLD,20));
		JLabel lNoClasses = new JLabel("NoOfClasses");
		lNoClasses.setFont(new Font("NoOfClasses",Font.BOLD,20));
		
		lNames.setOpaque(true);
		lNames.setBackground(Color.LIGHT_GRAY);
		lNames.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		lNoClasses.setOpaque(true);
		lNoClasses.setBackground(Color.LIGHT_GRAY);
		lNoClasses.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		lRC.setOpaque(true);
		lRC.setBackground(Color.LIGHT_GRAY);
		lRC.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		
				
		inPanel.add(lNames);
		inPanel.add(lRC);
		inPanel.add(lNoClasses);
				
		////////////////////////////////////////
		JLabel lN1 = new JLabel("Name1");
		lN1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lN1);
		
		JCheckBox c1 = new JCheckBox();
		c1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(c1);
		
		JLabel lNC = new JLabel("4");
		lNC.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lNC);
		/////////////////////////////////////////////
		
		JLabel lN2 = new JLabel("Name2");
		lN2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lN2);
		
		JCheckBox c2 = new JCheckBox();
		c2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(c2);
		
		JLabel lNC2 = new JLabel("6");
		lNC2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lNC2);
		
		/////
		
		JLabel lN3 = new JLabel("Name3");
		lN3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lN3);
		
		JCheckBox c3 = new JCheckBox();
		c3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(c3);
		
		JLabel lNC3 = new JLabel("2");
		lNC3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lNC3);
		///////
		
		JLabel lN4 = new JLabel("Name4");
		lN4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lN4);
		
		JCheckBox c4 = new JCheckBox();
		c4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(c4);
		
		JLabel lNC4 = new JLabel("7");
		lNC4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lNC4);
		//////
		
		JLabel lN5 = new JLabel("Name5");
		lN5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lN5);
		
		JCheckBox c5 = new JCheckBox();
		c5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(c5);
		
		JLabel lNC5 = new JLabel("5");
		lNC5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inPanel.add(lNC5);
		
				
		frame.getContentPane().add(inPanel,BorderLayout.WEST);
				
		//display at center
		frame.setLocationRelativeTo(null);
		//frame.pack();
		frame.setVisible(true);
	} 

	public static void main(String[] args) {
		
		
		createWindow();
	}
}

