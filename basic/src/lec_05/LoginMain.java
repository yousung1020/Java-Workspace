package lec_05;

import java.awt.*;
import javax.swing.*;
public class LoginMain extends JFrame {
	public LoginMain() {
		setTitle("LOGIN MAIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);
		
		this.setLayout(grid);
		this.add(new JLabel(" �����(id)"));
		this.add(new JTextField(""));
		this.add(new JLabel("��й�ȣ"));
		this.add(new JTextField(""));
		this.add(new JButton("�α���"));
		this.add(new JButton("���"));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginMain();
	}

}
