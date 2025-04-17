import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Drawloopexample extends JPanel {

    int stripeCount = 13; // the number of the stripe as deafult
    int starrow=6;    //the number of stars row
    int starcoulumns=8;  // the number of the stars columns
    
public Drawloopexample(){
    stripeCount = Integer.parseInt(JOptionPane.showInputDialog("How many stripe you want"));
    starrow = Integer.parseInt(JOptionPane.showInputDialog("how many row of stars you want"));
    starcoulumns = Integer.parseInt(JOptionPane.showInputDialog("how many coulumns of stars you want"));
}


@Override
public void paintComponent(Graphics g) {

    //The hight and width of the stripe

/*int w1 = 450;
int h1 = 28; */

int w11=getWidth();
int h11=getHeight();


for (int i = 0; i < stripeCount; i++) {
    if (i % 2 == 0) {
        g.setColor(Color.RED); // Odd number draw red
    } else {
        g.setColor(Color.WHITE); // even number draw white
    }
    g.fillRect(0, i*(h11/stripeCount), w11, h11); // the position and width and hight of the flag
}

      // THe stars area
      g.setColor(Color.blue);
      g.fillRect(0,0, (w11/stripeCount)*2, (h11/stripeCount)*7);

      int x =0; //where the stars begin
      int y=0;

        int starWidth=((w11/stripeCount)*2)/starcoulumns; //the size of the star
      int starHight=(h11/stripeCount)*7/starrow;

      //star width is blue square width / numOfcolumn
      //                          height / row
      
      
      

      for (int j=0;j<starrow;j++){ //nested loop

        for (int i=0;i<starcoulumns; i++) {
            g.setColor(Color.white);
            g.fillOval(x,y, starWidth,starHight );
            x +=starWidth;
      } 
      y+=starHight;
      x=0;
     }
}



public static void main(String[] args) {
var window = new JFrame();
window.setSize(450,392);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setContentPane(new Drawloopexample());
window.setVisible(true);
}
}