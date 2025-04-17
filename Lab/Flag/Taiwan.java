import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Taiwan extends JPanel {

    
@Override
public void paintComponent(Graphics g) { 

    g.setColor(Color.red);
    
      // THe stars area
      g.setColor(Color.blue);
      g.fillRect(0,0, 200, 150);

      var starWidth=80; //the size of the star
      var starHight=80;
      g.setColor(Color.white);
      g.fillOval(50, 40, starWidth, starHight);
      


     }



public static void main(String[] args) {


    
var window = new JFrame();
window.setSize(450,400);
window.setBackground(Color.red);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setContentPane(new Taiwan());
window.setVisible(true);
}
}