
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;


public class Garden {

    
    public ArrayList<Plant> plants;
    int w;
    int h;
   
    public Garden(int w, int h){
        plants = new ArrayList<Plant>();
        this.w = w;
        this.h = h;
        int x = w / 17;
        int y = h * 2 / 3;


    }


    public void myClear(){
        
        plants.clear();
        int x = w/17;
        int y =h*2/3;
        
    }


    
    public void newFlower(){
        Random ran =new Random();
        int randFlowerX = ran.nextInt(800);
        int randFlowerY = ran.nextInt(500-300)+300;


        //test remove when done
        System.out.println("flower x: " + randFlowerX);
        System.out.println("flower y" + randFlowerY);

        plants.add(new Flower(randFlowerX,randFlowerY));

        SoundPlayer.playother(); 

    }

    public void newWeed(){
       
        Random ran =new Random();
        int randFlowerX = ran.nextInt(800);
        int randFlowerY = ran.nextInt(500-300)+300;

        //test remove when done
        System.out.println("Weed x: " + randFlowerX);
        System.out.println("Weed y" + randFlowerY);

       plants.add(new Weed(randFlowerX,randFlowerY));
       SoundPlayer.playExplosion(); 
    }

        //1D 已經有 設定好圖片了 所以這裡只要pass g 進去draw 裡面就行了
    public void draw(Graphics g){

        //天空
        g.setColor(Color.blue);
        g.fillRect(0, 0, 800, 300);

        //草地
        g.setColor(Color.green);
        g.fillRect(0, 300, 800, 300);


         // 畫第一隻鳥（左邊）
        g.setColor(Color.GRAY);
        g.fillOval(250, 125, 60, 60); // 頭部
        g.fillOval(230, 160, 90, 60); // 身體
        g.fillArc(200, 140, 80, 80, 0, 180); // 翅膀
        g.fillArc(260, 140, 80, 80, 0, 180); // 翅膀
        
        // 畫第一隻鳥的眼睛
        g.setColor(Color.BLACK);
        g.fillOval(270, 145, 10, 10); // 左眼
        g.fillOval(290, 145, 10, 10); // 右眼
        
        // 畫第二隻鳥（右邊）
        g.setColor(Color.RED);
        g.fillOval(450, 125, 60, 60); // 頭部
        g.fillOval(430, 160, 90, 60); // 身體
        g.fillArc(400, 140, 80, 80, 0, 180); // 翅膀
        g.fillArc(460, 140, 80, 80, 0, 180); // 翅膀
        
        // 畫第二隻鳥的眼睛
        g.setColor(Color.BLACK);
        g.fillOval(470, 145, 10, 10); // 左眼
        g.fillOval(490, 145, 10, 10); // 右眼
                
        
        for (var w: plants){          
            w.draw(g);
        }
        
    }
}
    

