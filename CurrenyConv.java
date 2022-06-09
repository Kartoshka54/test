package LabExam3;

import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.MouseListener;

public class CurrenyConv extends JFrame {

    JLabel TRY = new JLabel(),
            USD = new JLabel(),
            EUR = new JLabel(),
            GBP = new JLabel();

    JTextField TRYtxt = new JTextField(),
            USDtxt = new JTextField(),
            EURtxt = new JTextField(),
            GBPtxt = new JTextField();


    JButton depoEUR = new JButton(),
    depoUSD = new JButton(),
    depoGBP = new JButton(),
    depoTRY = new JButton();











    public void main(String[] args) {
        CurrenyConv cc = new CurrenyConv();
        cc.setVisible(true);}

    public CurrenyConv(){
        super("Student Project Manager");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        add(TRY);
        add(TRYtxt);
        add(USD);
        add(USDtxt);
        add(EUR);
        add(EURtxt);
        add(GBP);
        add(GBPtxt);


    }



}
