package lec_07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class PanelEx extends JFrame{
    public PanelEx(){
        setTitle("title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JButton btnOk = new JButton("Yes");
        JButton btnCancel = new JButton("Cancel");

        add(new JLabel("do you like ice cream?"));
        add(btnOk);
        add(btnCancel);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("yes! i love a ice cream");
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("no! i hate a ice cream");
            }
        });

        setSize(500, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PanelEx();
    }
}
