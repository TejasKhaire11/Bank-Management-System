package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton Next;
    JTextField textName,textFname ,textEmail,textAddress, textCity,textPin,textState;
    JDateChooser dateChooser;
    Random ran =new Random();
    long first4=(ran.nextLong()%9000L)+1000l;
    String first=" "+Math.abs(first4);

    Signup(){
          super("APPLICATION FORM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);


        JLabel label1=new JLabel("APPLICATION FORM NO"+first);
        label1.setBounds(150,20,600,40);
        label1.setFont(new Font("Arial",Font.BOLD, 38));
        add(label1);


        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Arial",Font.BOLD,35));
        label2.setBounds(250,90,600,40);
        add(label2);


        JLabel label3=new JLabel("Personal Details ");
        setFont(new Font("Arial",Font.BOLD,40));
        label3.setBounds(350,140,600,30);
        add(label3);


        JLabel labelName=new JLabel ("Name: ") ;
       labelName.setFont(new Font("Arial",Font.BOLD,25));
        labelName.setBounds(100,190,100,30);
        add(labelName);
        textName =new JTextField();
        textName .setFont(new Font("Arial",Font.BOLD,15));
        textName.setBounds(300,190,400,30);
        add(textName);


        JLabel labelFname=new JLabel ("Father's Name: ") ;
        labelFname.setFont(new Font("Arial",Font.BOLD,25));
        labelFname.setBounds(100,240,200,30);
        add(labelFname);
        textFname =new JTextField();
        textFname .setFont(new Font("Arial",Font.BOLD,15));
        textFname.setBounds(300,240,400,30);
        add(textFname);


        JLabel DOB=new JLabel ("Date Of Birth: ") ;
        DOB.setFont(new Font("Arial",Font.BOLD,25));
        DOB.setBounds(100,350,200,30);
        add(DOB);
        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,350,400,30);
        add(dateChooser);



    JLabel labelG=new JLabel("Gender:");
    labelG.setFont(new Font("Arial",Font.BOLD,25));
    labelG.setBounds(100,290,200,30);
    add(labelG);
    r1=new JRadioButton("Male");
    r1.setFont(new Font("Arial",Font.BOLD,14));
    r1.setBackground(new Color(222,228,225));
    r1.setBounds(300,290,60,30);
    add(r1);
    r2=new JRadioButton("Female");
    r2.setFont(new Font("Arial",Font.BOLD,14));
    r2.setBackground(new Color(222,228,225));
    r2.setBounds(450,290,90,30);
    add(r2);
    ButtonGroup buttonGroup=new ButtonGroup();
    buttonGroup.add(r1);
    buttonGroup.add(r2);


        JLabel labelEmail=new JLabel("Email Address:");
        labelEmail.setFont(new Font("Arial",Font.BOLD,25));
        labelEmail.setBounds(100,330,500,200);
        add(labelEmail);
        textEmail =new JTextField();
        textEmail.setFont(new Font("Arial",Font.BOLD,15));
        textEmail.setBounds(300,420,400,30);
        add(textEmail);



        JLabel labelMS=new JLabel("Marital Status:");
        labelMS.setFont(new Font("Arial",Font.BOLD,25));
        labelMS.setBounds(100,480,200,30);
        add(labelMS);
        m1=new JRadioButton("Married");
        m1.setFont(new Font("Arial",Font.BOLD,15));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,480,110,30);
        add(m1);
        m2=new JRadioButton("UnMarried");
        m2.setFont(new Font("Arial",Font.BOLD,15));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,480,110,30);
        add(m2);
        m3=new JRadioButton("Other");
        m3.setFont(new Font("Arial",Font.BOLD,15));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600,480,110,30);
        add(m3);
           ButtonGroup buttonGroup1=new ButtonGroup();
           buttonGroup1.add(m1);
           buttonGroup1.add(m2);
           buttonGroup1.add(m3);



        JLabel labelAddress=new JLabel("Address :");
        labelAddress.setFont(new Font("Arial",Font.BOLD,25));
        labelAddress.setBounds(100,540,200,30);
        add( labelAddress);
        textAddress =new JTextField();
        textAddress.setFont(new Font("Arial",Font.BOLD,15));
        textAddress.setBounds(300,540,400,30);
        add(textAddress);



        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Arial",Font.BOLD,25));
        labelCity.setBounds(100,590,200,30);
        add( labelCity);
        textCity =new JTextField();
        textCity.setFont(new Font("Arial",Font.BOLD,15));
        textCity.setBounds(300,590,400,30);
        add( textCity);



        JLabel labelPincode=new JLabel("PinCode:");
        labelPincode.setFont(new Font("Arial",Font.BOLD,25));
        labelPincode.setBounds(100,640,200,30);
        add( labelPincode);
        textPin =new JTextField();
        textPin.setFont(new Font("Arial",Font.BOLD,15));
        textPin.setBounds(300,640,400,30);
        add( textPin);


        JLabel labelState=new JLabel("State :");
        labelState.setFont(new Font("Arial",Font.BOLD,25));
        labelState.setBounds(100,690,200,30);
        add(  labelState);
        textState =new JTextField();
        textState.setFont(new Font("Arial",Font.BOLD,15));
        textState.setBounds(300,690,400,30);
        add( textState);

        Next=new JButton("Next");
        Next.setFont(new Font("Arial",Font.BOLD,20));
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.setBounds(400,730,80,30);
        Next.addActionListener(this);
        add(Next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=textName.getText();
        String fname=textFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="male";
        }else if(r2.isSelected()){
            gender="female";
        }
        String marital=null;
        if(m1.isSelected()){
            marital="married";
        }
        else if(m2.isSelected()){
            marital="unmarried";
        }

        else if(m3.isSelected()){
            marital="other";
        }
        String address=textAddress.getText();
        String city=textCity.getText();
        String Pincode=textPin.getText();
        String state=textState.getText();
        String email=textEmail.getText();

        try{
            if (name.trim().isEmpty() || fname.trim().isEmpty() || dob.trim().isEmpty() ||
                    gender == null || email.trim().isEmpty() || marital == null ||
                    address.trim().isEmpty() || city.trim().isEmpty() ||
                    Pincode.trim().isEmpty() || state.trim().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please fill all the fields.");
                return;
            }

            else{
        Con con1=new Con();
        String q = "INSERT INTO signup VALUES('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + Pincode + "', '" + state + "')";
        con1.statement.executeUpdate(q);
        new Signup2(first);
        setVisible(false);
        }
        }
        catch(Exception E){
         E.printStackTrace();


        }



    }

    public static void main(String  []args){

        new Signup();
    }

}
