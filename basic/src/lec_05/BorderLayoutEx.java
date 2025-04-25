package lec_05;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	
	public BorderLayoutEx() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout(30, 20));
		
		this.add(new JButton("Calculate"), BorderLayout.CENTER);
		this.add(new JButton("add"), BorderLayout.NORTH);
		this.add(new JButton("sub"), BorderLayout.SOUTH);
		this.add(new JButton("mul"), BorderLayout.EAST);
		this.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200);
		// pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}
