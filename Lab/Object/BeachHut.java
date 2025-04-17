package Object;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

public class BeachHut {
    int moveitup;
    private Point pos;
    private Color roofColor;
    private Color wallColor;
    int wallx,wally;


    //Default constructors here
    public BeachHut() {
        wallx = 175;
        wally  = 160;
        wallColor = Color.gray;
        roofColor = Color.red;
    }

    //Constructor with Parameters
    public BeachHut(int x, int y){
        wallx = x;
        wally = y;
    }

    //Method for color
    public void setRoofColor(Color c){
        roofColor = c;
        
    }
    //Method for wall color
    public void setWallColor(Color c){
        wallColor = c;
       
    }

    // Method for Draw
    public void draw(Graphics g, int moveitup){
        g.setColor(wallColor); 
        g.fillRect(wallx, wally+moveitup, 100, 120);
        //roof
        g.setColor(roofColor);
        g.fillRect(wallx-10, wally-30+moveitup, 135, 50);
        //door
        g.setColor(Color.red); 
        g.fillRect(wallx+40, wally+75+moveitup, 20, 45);
        //window
        g.setColor(Color.red);
        g.fillRect(wallx+10, wally+35+moveitup, 20, 20);
        //word
        g.setColor(Color.BLACK);
        g.drawRect(wallx+33, wally+23+moveitup, 63,12 );
        g.drawString("Sheng's hut", wallx+35, wally+35+moveitup);
    }

}
