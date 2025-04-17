import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Class extends JPanel {

@Override
public void paintComponent(Graphics g) {
    String filename = "text.txt";
    File f = new File (filename);
    Scanner s = new Scanner(f);
    while (s.hasNext() == true) {
        String text = s.next();
        Systme.out.println("The word bruh"+ text );
    }
    s.close();
}


public static void main(String[] args) {
var window = new JFrame();
window.setSize(200,200);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setContentPane(new Class());
window.setVisible(true);
}
}