import java.awt.Graphics;
import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class Plant {
    
    
    //定義這個class的 attribute
    protected ImageIcon image;
    private Point pos;

    public Plant(int x, int y){
        pos = new Point(x, y);
    }


    public void draw(Graphics g){
        
        //null check 
        if (image != null){
            g.drawImage(image.getImage(), pos.x, pos.y, null);
        }
        else{
            g.drawString("plant", pos.x, pos.y);
        }
        
    }
}
