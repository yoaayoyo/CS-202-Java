package Theater;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Theater extends JPanel {

    int age;
    ImageIcon img;
    int response; 
   

    public Theater() {

                response = JOptionPane.showConfirmDialog(
                null, 
                "Do you have a student or military ID?", 
                "You got Discount", 
                JOptionPane.YES_NO_OPTION
                
        );
        
        String input = JOptionPane.showInputDialog("Please enter your age");
        age = Integer.parseInt(input);
       
            
    }

    @Override
    public void paintComponent(Graphics g) {

        if (age >= 0 && age < 3) {
            g.drawString("You get in free!", 10, 10);
            img = new ImageIcon("sonic.png");
            img.paintIcon(null, g, 20, 20);
            
    }    
    else if (age >=3 && age <11){
            g.drawString("You own 7.00!", 10, 10);
            img = new ImageIcon("wicked.png");
            img.paintIcon(null, g, 20, 20);
            

    }
    else if (age >11 && age < 60){

        if (response == JOptionPane.YES_OPTION) {
            g.drawString("You owe $8.00!", 10, 10);
        } else {
            g.drawString("You owe $10.00!", 10, 10);
        }
        img = new ImageIcon("lotr.png");
        img.paintIcon(null, g, 20, 20);
        
    }
    else if (age >=60 && age <120){
        g.drawString("That will be 7.00!", 10, 10);
        img = new ImageIcon("Daisy.png");
        img.paintIcon(null, g, 20, 20);
        
    }
}

public static void main(String[] args) {
var window = new JFrame();
window.setSize(400,400);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setContentPane(new Theater());
window.setVisible(true);
}

}