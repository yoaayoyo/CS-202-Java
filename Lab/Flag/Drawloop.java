import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Drawloop extends JPanel {

    int flagstripe; // 用來存儲行數
    int starRows;
    int starColumns;

    // 建構函數中獲取用戶輸入的星星行數
    public Drawloop(int starRows, int starColumns, int stripeCount) {
        this.starRows = starRows;
        this.starColumns = starColumns;
        this.flagstripe = stripeCount;
    }

    
@Override
public void paintComponent(Graphics g) { 

    
    //The hight and width of the stripe
int w1 = 450;
int h1 = 28;
    
    for (int j=0; j<7; j++){
        for (int i = 0; i < 2; i++) {
                g.setColor(Color.RED); // Odd number draw red
                g.setColor(Color.WHITE); // even number draw white
            g.fillRect(0, i*h1, w1, h1); // the position and width and hight of the flag
    }
}
      // THe stars area
      g.setColor(Color.blue);
      g.fillRect(0,0, 182, 196);

      int x =0; //where the stars begin
      int y=0;

      var starWidth=21; //the size of the star
      var starHight=21;

      var starrow=6;    //the number of stars row
      var starcoulumns=8;  // the number of the stars columns

      for (int j=0;j<starrow;j++){ //nested loop

        for (int i=0;i<starcoulumns; i++) {
            g.setColor(Color.white);
            g.fillOval(x, y, starWidth, starHight);
            x +=21;
      } 
      y+=21;
      x=0;
     }
}



public static void main(String[] args) {
    
    String promp= JOptionPane.showInputDialog("tell me how many stars you want");
    int flagstripe = Integer.parseInt(promp);

    String starRowsInput = JOptionPane.showInputDialog("How many rows of stars do you want?");
    int starRows = Integer.parseInt(starRowsInput);  // 用戶輸入的星星行數

    String starColumnsInput = JOptionPane.showInputDialog("How many columns of stars do you want?");
    int starColumns = Integer.parseInt(starColumnsInput);  // 用戶輸入的星星列數


var window = new JFrame();
window.setSize(450,392);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setContentPane(new Drawloop(starRows,starColumns,flagstripe));
window.setVisible(true);
}
}
