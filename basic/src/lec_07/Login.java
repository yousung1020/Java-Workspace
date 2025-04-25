package lec_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    public Login(){
        setTitle("Login Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 2));

        JTextField email = new JTextField();
        JPasswordField pwd = new JPasswordField();

        JButton login = new JButton("Login");
        JButton cancel = new JButton("Cancel");

        add(new JLabel("email"));
        add(email);
        add(new JLabel("password"));
        add(pwd);
        add(login);
        add(cancel);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String emailInput = email.getText();
                String pwdInput = new String(pwd.getPassword());

                if(emailInput.equals("hong@gmail.com") && pwdInput.equals("1234")){
                    System.out.println("login success");
                }
                else{
                    System.out.println("login fail! retry please");
                }
            }
        });

        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                email.setText("");
                pwd.setText("");
            }
        });

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
