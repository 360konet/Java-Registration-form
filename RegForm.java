package regform;

import javax.swing.*;
import java.awt.event.*;

public class RegForm implements ActionListener{
    JFrame f;
    JButton sub,clear;
    JLabel tit,fn,ln,age,gen,add,work,agree,result;
    JTextField Tfn,Tln,Tage,Tgen,Tadd,Twork;
    JCheckBox Cagree;
    
    RegForm(){
        f = new JFrame("MAKE Registration Form");
        
        tit = new JLabel("Please correctly fill-out the form");
        tit.setBounds(250,5,300,40);
       
        fn = new JLabel("Enter First Name");
        fn.setBounds(10,30,100,40);
        Tfn = new JTextField();
        Tfn.setBounds(110,30,100,30);
        
        ln = new JLabel("Enter Last Name");
        ln.setBounds(10,70,100,40);
        Tln = new JTextField();
        Tln.setBounds(110,70,100,30);
        
        age = new JLabel("Enter Age");
        age.setBounds(10,110,100,40);
        Tage = new JTextField();
        Tage.setBounds(110,110,100,30);
        
        add = new JLabel("Enter Address");
        add.setBounds(10,150,100,40);
        Tadd = new JTextField();
        Tadd.setBounds(110,150,100,30);
        
        work = new JLabel("Enter occupation");
        work.setBounds(10,190,100,40);
        Twork = new JTextField();
        Twork.setBounds(110,190,100,30);
        
        Cagree = new JCheckBox();
        Cagree.setBounds(10,230,30,30);
        agree = new JLabel("I agree all info provided is correct and legit");
        agree.setBounds(40,230,300,30);
        
        sub = new JButton("Submit");
        sub.setBounds(10,300,80,30);
        sub.addActionListener(this);
        
        clear = new JButton ("Clear");
        clear.setBounds(150,300,80,30);
        
        result = new JLabel();
        result.setBounds(100,350,300,40);
                
        f.add(fn);
        f.add(Tfn);
        
        f.add(ln);
        f.add(Tln);
        
        f.add(age);
        f.add(Tage);
        
        f.add(add);
        f.add(Tadd);
        
        f.add(work);
        f.add(Twork);
        
        f.add(Cagree);
        f.add(agree);
        
        f.add(add);
        f.add(Tadd);
        
        f.add(sub);
        f.add(clear);
        
        f.add(result);
        
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String a = "Form submitted succesfully";
        result.setText(a);
    }
    public static void main(String[] args){
        new RegForm();
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
}
