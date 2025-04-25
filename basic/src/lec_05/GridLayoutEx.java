package lec_05;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		
		this.setLayout(grid);
		this.add(new JLabel(" a"));
		this.add(new JTextField(""));
		this.add(new JLabel(" b"));
		this.add(new JTextField(""));
		this.add(new JLabel(" c"));
		this.add(new JTextField(""));
		this.add(new JLabel(" d"));
		this.add(new JTextField(""));
		this.add(new JButton("login"));
		this.add(new JButton("password"));
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}
}
