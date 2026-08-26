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
    private JTextField Radius;
    private JLabel Sentens;
    private JComboBox Choose_Color;
    private String s[] = {"Red","Blue","Orange","Yellow"};
    
    private void Get_Dimention(){
        this.setBounds(400,200,400,200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Graphical App");
        this.setLayout(null);
        
        Radius = new JTextField();
        Sentens = new JLabel();
        Choose_Color = new JComboBox(s);

        Btn = new JButton();
        Btn.addActionListener(this::Pass_Data_Action);
        
        Sentens.setBounds(10, 6, 360, 40);
        Sentens.setText("Enter the Radius and Choose Color");
        Sentens.setHorizontalAlignment(JTextField.CENTER);
        Sentens.setFont(new Font("Yu Gothic UI", 1, 18));

        Radius.setBounds(80, 50, 100, 40);
        Radius.setFont(new Font("Yu Gothic UI", 1, 20));
        Radius.setHorizontalAlignment(JTextField.CENTER);
        
        Choose_Color.setBounds(190, 50, 100, 40);
        Choose_Color.setFont(new Font("Yu Gothic UI", 1, 16));
        
        Btn.setBounds(80, 100, 210, 40);
        Btn.setText("Build Image");
        Btn.setFont(new Font("Yu Gothic UI", 1, 20));
        
        this.add(Choose_Color);
        this.add(Btn);
        this.add(Sentens);
        this.add(Radius);
        
        this.setVisible(true);
    }
    
    private void Pass_Data_Action (ActionEvent evt){
        System.out.println(Radius.getText());
        System.out.println(Choose_Color.getSelectedItem());
        
    }
}
