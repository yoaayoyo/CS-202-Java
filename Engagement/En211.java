package Engagement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class En211 extends JPanel {

    public void sing() {
        singChorus();
        singChorus();
        System.out.println("Happy birthday to you");
        singChorus();
    }

    public void singChorus() {
        System.out.println("Happy birthday to you");
    }

    @Override   
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public static void main(String[] args) {
        var window = new JFrame("Birthday Song");

        window.setSize(200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new En211());
        window.setVisible(true);

        // 呼叫 sing() 方法
        new En211().sing();
    }
}