
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.util.ArrayList;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel implements KeyListener {

    private ArrayList <Pokemon> yo;
    
    public Main(){
        yo = new ArrayList<Pokemon>();
        yo.add(new Pichu(1));
        yo.add(new Pikachu(2));
        yo.add(new Raichu(3));
        yo.add(new Charmander(4));
        yo.add(new Charmelon(5));
        yo.add(new Charizard(6));

        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.BLACK);
        for (var 欸:yo){
            欸.draw(g);
        }
        requestFocusInWindow();
    }

    

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        char sheng =e.getKeyChar();
        int num =sheng-'0';
        System.out.println(num);

        for (var p : yo){
            System.out.println(num+"g"+p.getid());
        

            if (p.getid() ==num){
                yo.remove(p);
                System.out.println("deleting polemon"+num);
                break;
            }
        } 
        
        repaint();

    
    }
    



     public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1000,1000);
		window.setContentPane(new Main());
		window.setVisible(true);
     }

    }