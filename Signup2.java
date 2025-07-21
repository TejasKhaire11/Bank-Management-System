package bank.management.system;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton Next   ;
    String formno;
    Signup2(String first){
    super("Application form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno=formno;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Detail");
        l2.setFont(new Font("Raleway",Font.BOLD,22));;
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={"Hindu","Muslim","Christian","other"};
        combobox=new JComboBox(religion);
        combobox.setBackground(new Color(252,208,76));
        combobox.setFont(new Font("Raleway",Font.BOLD,14));
        combobox.setBounds(350,120,320,30);
        add(combobox);

        JLabel l4=new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[]={"Genral","OBC","SC","ST","Other"};
        combobox2=new JComboBox(category);
        combobox2.setFont(new Font("Raleway",Font.BOLD,17));
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setBounds(350,170,135,30);
        add(combobox2);

        JLabel l5=new JLabel("Income ");
        l5.setFont(new Font("Raleway",Font.BOLD,22));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto  10,00,000","above 10,00,000"};
        combobox3=new JComboBox(income);
        combobox3.setFont(new Font("Raleway",Font.BOLD,17));
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setBounds(350,220,135,30);
        add(combobox3);


        JLabel l6=new JLabel("Education ");
        l6.setFont(new Font("Raleway",Font.BOLD,22));
        l6.setBounds(100,270,130,30);
        add(l6);

        String education[]={"Non graduate","graduate","Post graduate","Doctorate","Other"};
        combobox4=new JComboBox(education);
        combobox4.setFont(new Font("Raleway",Font.BOLD,17));
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setBounds(350,270,135,30);
        add(combobox4);

        JLabel l7=new JLabel("Ocupation ");
        l7.setFont(new Font("Raleway",Font.BOLD,22));
        l7.setBounds(100,320,130,30);
        add(l7);

        String ocupation[]={"Salaried ","Self Employee","Business","Student","Retierd","Other"};
        combobox5=new JComboBox(ocupation);
        combobox5.setFont(new Font("Raleway",Font.BOLD,17));
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setBounds(350,320,135,30);
        add(combobox5);

        JLabel l8=new JLabel("PAN Number ");
        l8.setFont(new Font("Raleway",Font.BOLD,22));
        l8.setBounds(100,360,180,30);
        add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Relway",Font.BOLD,22));
        textPan.setBounds(350,360,320,30);
        add(textPan);


        JLabel l9=new JLabel("Aadhar Number ");
        l9.setFont(new Font("Raleway",Font.BOLD,22));
        l9.setBounds(100,400,180,30);
        add(l9);

        textAadhar=new JTextField();
        textAadhar.setFont(new Font("Relway",Font.BOLD,22));
        textAadhar.setBounds(350,400,320,30);
        add(textAadhar);

    //Senior Citizen

        JLabel l10=new JLabel("Senior Citizen ");
        l10.setFont(new Font("Raleway",Font.BOLD,22));
        l10.setBounds(100,440,320,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(400,440,80,30);
        add(r1);

        r2=new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(500,440,80,30);
        add(r2);
        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(r1);
        buttonGroup2.add(r2);

        //Existing Account
        JLabel l11=new JLabel("Existing Account ");
        l11.setFont(new Font("Raleway",Font.BOLD,22));
        l11.setBounds(100,480,320,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(400,480,80,30);
        add(e1);

        e2=new JRadioButton("NO");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(500,480,80,30);
        add(e2);

        ButtonGroup buttonGroup3=new ButtonGroup();
        buttonGroup3.add(e1);
        buttonGroup3.add(e2);


        JLabel l12=new JLabel("Form No");
        l12.setFont(new Font("Raleway",Font.BOLD,22));
        l12.setBounds(700,10,130,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,22));
        l13.setBounds(760,10,60,30);
        add(l13);


        Next=new JButton("Next");
        Next.setFont(new Font("Raleway",Font.BOLD,15));
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.setBounds(570,640,100,30);
        Next.addActionListener(this);
        add(Next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,200,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String Religion=(String) combobox.getSelectedItem();
        String category=(String) combobox2.getSelectedItem();
        String Income=(String) combobox3.getSelectedItem();
        String Education=(String) combobox4.getSelectedItem();
        String Occupation =(String) combobox5.getSelectedItem();

        String Pan_Number=textPan.getText();
        String Aadhar_Number=textAadhar.getText();

        String Senior_Citizen=" ";
        if((r1.isSelected())){
            Senior_Citizen="Yes";
        }
        else if(r2.isSelected()){
            Senior_Citizen="No";
        }


        String Existing_Account=" ";
        if(r1.isSelected()){
            Existing_Account="Yes";
        }
        else if(r2.isSelected()){
             Existing_Account="No";
        }
        try {
            if(textPan.getText().equals("")|| textAadhar.getText().equals("")){

                JOptionPane.showMessageDialog(null,"Fill all the fields");
        }
            else {
            Con c1=new Con();
            String q="Insert into Signup2 Values('" +formno + "','"+Religion+"','"+category+"','"+Income+"','"+Education+"','"+Occupation+"','"+Pan_Number+"','"+Aadhar_Number+"','"+Senior_Citizen+"','"+Existing_Account+"')";

            c1.statement.executeUpdate(q);
            new Signup3(formno);
            setVisible(false);
        }

            }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String []args){

    new Signup2("");
    }
}
