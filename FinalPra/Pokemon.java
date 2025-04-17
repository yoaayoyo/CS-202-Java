import java.security.PrivateKey;
import java.util.Random;

import java.awt.Point;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public abstract class Pokemon extends JPanel {
    
    private ImageIcon image;
    private Point pos;
    private int id;

    public Pokemon ( int n){
        Random ran= new Random();
        int x = ran.nextInt(800);
        int y = ran.nextInt(800);

        pos = (new Point (x,y));

        id = n;
        
    }

    public int getid(){
        return id;
    }

    public void setImage(String s){
        image = new ImageIcon(s);
        

        

    }

    public void draw(Graphics g){
        image.paintIcon(null, g, pos.x, pos.y);
        g.drawString(""+id,pos.x,pos.y);
        

    }


}