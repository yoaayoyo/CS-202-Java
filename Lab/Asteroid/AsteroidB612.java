import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;

public class AsteroidB612 extends JPanel {
int dy;
String yesno;
ImageIcon sheep;

//This is a "constructor"
public AsteroidB612() {
sheep = new ImageIcon("sheep.png");
String jaera = JOptionPane.showInputDialog("Tell me a DY value for the little prince");
dy = Integer.parseInt(jaera);
yesno = JOptionPane.showInputDialog("Does he have a sheep? (y/n)");
}



@Override
public void paintComponent(Graphics g) {
var w = getWidth();
var h = getHeight();
//draw the inky black expanse of outer space
g.setColor(Color.BLACK);
g.fillRect(0,0,w,h);

//draw the asteroid
g.setColor(Color.GRAY);
g.fillOval(-300, 300, 1000, 1000);

//draw his body
g.setColor(Color.GREEN);
g.fillRect(175, 150+dy, 50, 100);
g.fillRect(175, 250+dy, 20, 70);
g.fillRect(205, 250+dy, 20, 70);

//draw the little prince's head
g.setColor(new Color(189, 127, 93));
g.fillOval(175, 90+dy, 50, 60);

//draw a bow tie
g.setColor(Color.RED);
g.fillOval(191, 140+dy, 10, 15);
g.fillOval(200, 140+dy, 10, 15);

//draw a message
g.setColor(Color.WHITE);
if (dy < 0) {
g.drawString("He's floating in space!", 20, 20);
} else {
g.drawString("Safely grounded on the asteroid.", 20, 20);
}
if (yesno.equals("y")) {
sheep.paintIcon(null, g, 10, 200+dy);
}
}
public static void main(String[] args) {
var window = new JFrame();
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setSize(400,400);
window.setContentPane(new AsteroidB612());
window.setVisible(true);
}
}