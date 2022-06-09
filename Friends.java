package LabExam3;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Friends extends JFrame implements MouseListener{

    JTextField txtname = new JTextField();
    JTextField txtage = new JTextField();
    JTextField txtindexC = new JTextField();
    JButton btntxtsave = new JButton("Save as text");
    JButton btnCancel = new JButton("Cancel");

    public Friends() {
        super("Friends");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(4, 2));
        setDesign();

    }
    public void setDesign() {
        add(new JLabel("Name"));
        add(txtname);
        add(new JLabel("Age"));
        add(txtage);
        add(new JLabel("Index of the corona virus"));
        add(txtindexC);
        add(btnCancel);
        add(btntxtsave);

        btnCancel.addMouseListener(this);
        btntxtsave.addMouseListener(this);
    }
//allah yok please
    public static void main(String[] args) {
        new Friends().setVisible(true);

    }

    public void saveAsText() throws IOException {
        FileWriter fw = new FileWriter("FriendsInfo.txt", true);
        fw.write("age:10");
        fw.write("index:2");
        fw.close();
    }
    public void saveObject() throws IOException{

       int age = 20;

        if(age < 18 && age > 100) {
            System.out.println("Age must be between 18 and 100");

        }
        else{
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of friends");

        FriendsInfo f1 = new FriendsInfo(10, 2);


        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}

