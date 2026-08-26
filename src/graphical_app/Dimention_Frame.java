package graphical_app;

import javax.swing.JFrame;

public class Dimention_Frame extends JFrame{
    
    public Dimention_Frame(){
        Get_Dimention();
    }
    
    private void Get_Dimention(){
        this.setSize(200,200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Enter Yout Dimentions");
        
        this.setVisible(true);
    }
    
}
