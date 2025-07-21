package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;


    login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image iii2 = iii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(60, 350, 100, 100);
        add(iiimage);

        ImageIcon iiii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image iiii2 = iiii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iiii3 = new ImageIcon(iiii2);
        JLabel iiiimage = new JLabel(iiii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iiiimage);


        ImageIcon iiiii1 = new ImageIcon(ClassLoader.getSystemResource("icon/provider.png"));
        Image iiiii2 = iiiii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iiiii3 = new ImageIcon(iiiii2);
        JLabel iiiiimage = new JLabel(iiiii3);
        iiiiimage.setBounds(630, 350, 100, 100);
        add(iiiiimage);

        label1 = new JLabel("Welcome to Atm");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Aventgrade", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Card no:");
        label1.setForeground(Color.white);
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setBounds(150, 190, 375, 30);
        add(label2);


        textField2 = new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 28));
        add(textField2);


        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Arial", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        add(label3);


        passwordField3 = new JPasswordField("15");
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);


        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300, 100, 30);
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430, 300, 100, 30);
        add(button2);
        button2.addActionListener(this);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300, 350, 230, 30);
        add(button3);
        button3.addActionListener(this);


        ImageIcon iiiiii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iiiiii2 = iiiiii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iiiiii3 = new ImageIcon(iiiiii2);
        JLabel iiiiiimage = new JLabel(iiiiii3);
        iiiiiimage.setBounds(0, 0, 850, 480);
        add(iiiiiimage);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == button1) {

            } else if (e.getSource() == button2) {

                textField2.setText(" ");
                passwordField3.setText(" ");
            } else if (e.getSource() == button3) {


            }

        } catch (Exception E) {
            E.printStackTrace();


        }
    }

        public static void main (String[]args){

            new login();
        }
    }

