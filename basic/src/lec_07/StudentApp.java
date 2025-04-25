package lec_07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class StudentApp extends JFrame{
    public StudentApp(){
        ArrayList<Student> students = new ArrayList<>();

        setTitle("Student1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        JTextField nameField = new JTextField("");
        JTextField idField = new JTextField("");
        JTextField majorField = new JTextField("");
        JTextField subjectField = new JTextField("");

        JButton input = new JButton("input");
        JButton cancel = new JButton("Cancel");
        JButton fs = new JButton("find or file saved");
        JButton search = new JButton("search by name");

        add(new JLabel("name"));
        add(nameField);
        add(new JLabel("student id"));
        add(idField);
        add(new JLabel("major"));
        add(majorField);
        add(new JLabel("subject"));
        add(subjectField);
        add(input);
        add(cancel);
        add(fs);
        add(search);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                students.add(new Student(nameField.getText(), idField.getText(), majorField.getText(),
                        subjectField.getText()));
                System.out.println(nameField.getText() + ",it's in");
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                idField.setText("");
                subjectField.setText("");
                majorField.setText("");
            }
        });

        fs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(Student student: students){
                    System.out.println(student.toString());

                    try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Temp/student.txt"))){
                        bw.write(student.toString());

                    } catch(IOException exception){
                        System.out.println(exception.getMessage());
                    }
                }
            }
        });

        search.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                for(Student student: students){
                    if(student.getName().equals(nameField.getText())){
                        idField.setText(student.getStuId());
                        subjectField.setText(student.getSubject());
                        majorField.setText(student.getMajor());
                        break;
                    }
                    else{
                        System.out.println("no exist student");
                    }
                }
            }
        });

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentApp();
    }
}
