package lec_05;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe_2 extends JFrame {
	// ������
	public Myframe_2() {
		// super("ù��° ������");
		setTitle("ù��° ������");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("Ȯ��");
		btn1.setBackground(Color.ORANGE);
		add(btn1);
		this.add(new JButton("Ȯ��"));
		this.add(new JButton("���"));
		this.setLayout(new FlowLayout());
		
		this.setSize(300, 200);
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Myframe_2 frame = new Myframe_2();
		new Myframe_2();
	}

}

