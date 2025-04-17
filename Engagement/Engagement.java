package Engagement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;  


public class Engagement extends JPanel{



    @Override   
    public void paintComponent(Graphics g) {

    }


    public static void main (String[] args) {
       
        var window = new JFrame();  //this creat a new window
        
        window.setSize(200,200);  //set the size of that window
       
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //have this to be able to exit our window

        window.setContentPane(new Engagement()); // with this, I will able to write thing on that window

        window.setVisible(true); //it makes my window visible, if I fill "false in the () then it is not visible"
    }

}