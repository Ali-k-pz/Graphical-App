package graphical_app;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Dimention_Frame extends JFrame{
    
    public Dimention_Frame(){
        Get_Dimention();
    }
    
    private JButton Btn;
    private JTextField Weight,Height,Radius;
    private JLabel Sentens,H_Label,W_Label,R_Label,C_Label;
    private JComboBox Choose_Color;
    private String s[] = {"Red","Blue","Orange","Yellow"};
    
    private void Get_Dimention(){
        this.setBounds(400,200,400,250);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Graphical App");
        this.setLayout(null);
        
        Height = new JTextField();
        Weight = new JTextField();
        Radius = new JTextField();
        Sentens = new JLabel();
        H_Label = new JLabel();
        W_Label = new JLabel();
        R_Label = new JLabel();
        C_Label = new JLabel();
        Choose_Color = new JComboBox(s);

        Btn = new JButton();
        Btn.addActionListener(this::Pass_Data_Action);
        
        Sentens.setBounds(10, 6, 360, 40);
        Sentens.setText("Enter the Dimentions and Choose Color");
        Sentens.setHorizontalAlignment(JTextField.CENTER);
        Sentens.setFont(new Font("Yu Gothic UI", 1, 18));

        Weight.setBounds(75, 50, 100, 40);
        Weight.setFont(new Font("Yu Gothic UI", 1, 20));
        Weight.setHorizontalAlignment(JTextField.CENTER);
        
        W_Label.setBounds(15, 47, 55, 40);
        W_Label.setFont(new Font("Yu Gothic UI", 1, 14));
        W_Label.setHorizontalAlignment(JLabel.CENTER);
        W_Label.setText("Weight :");

        Height.setBounds(265, 50, 100, 40);
        Height.setFont(new Font("Yu Gothic UI", 1, 20));
        Height.setHorizontalAlignment(JTextField.CENTER);
        
        H_Label.setBounds(205, 47, 55, 40);
        H_Label.setFont(new Font("Yu Gothic UI", 1, 14));
        H_Label.setHorizontalAlignment(JLabel.CENTER);
        H_Label.setText("Height :");

        Radius.setBounds(75, 100, 100, 40);
        Radius.setFont(new Font("Yu Gothic UI", 1, 20));
        Radius.setHorizontalAlignment(JTextField.CENTER);

        R_Label.setBounds(15, 100, 55, 40);
        R_Label.setFont(new Font("Yu Gothic UI", 1, 14));
        R_Label.setHorizontalAlignment(JLabel.CENTER);
        R_Label.setText("Radius :");
        
        Choose_Color.setBounds(265, 100, 100, 40);
        Choose_Color.setFont(new Font("Yu Gothic UI", 1, 16));

        C_Label.setBounds(205, 100, 55, 40);
        C_Label.setFont(new Font("Yu Gothic UI", 1, 14));
        C_Label.setHorizontalAlignment(JLabel.CENTER);
        C_Label.setText("Color :");
        
        Btn.setBounds(45, 150, 300, 40);
        Btn.setText("Build Image");
        Btn.setFont(new Font("Yu Gothic UI", 1, 20));
        
        this.add(Sentens);
        this.add(Weight);
        this.add(W_Label);
        this.add(Height);
        this.add(H_Label);
        this.add(Radius);
        this.add(R_Label);
        this.add(Choose_Color);
        this.add(C_Label);
        this.add(Btn);
        
        this.setVisible(true);
    }
    
    private void Pass_Data_Action (ActionEvent evt){
        System.out.println(Weight.getText());
        System.out.println(Height.getText());
        System.out.println(Radius.getText());
        System.out.println(Choose_Color.getSelectedItem());
        
    }
}
