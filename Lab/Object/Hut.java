package Object;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Hut extends JPanel {  
	
	int moveitup;
    BeachHut house;                    //這邊宣告
    BeachHut house2;

	public Hut() {

		String myhut = JOptionPane.showInputDialog("Tell me how you want to move it");
		moveitup = Integer.parseInt(myhut);    //這行代表輸入數字來調整hut的位置
        house = new BeachHut();                     //這邊創建了我剛剛宣告的物件
        house2 = new BeachHut(50,120);
        house2.setRoofColor(Color.red);
        house2.setWallColor(Color.yellow);
	}

	@Override
	public void paintComponent(Graphics g) {

		//The background
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, 600, 600);   // the first two number for x,y starts from the top left corner.



        // draw the ground
        g.setColor(Color.green);
        g.fillRect(0, 200, 400, 200);

        //draw the ocean
        g.setColor(Color.blue);
        g.fillOval(-550, 300, 1500, 1000);

       
        house.draw(g,moveitup);
        house2.draw(g,moveitup);
        
        
		//cloud
		 g.setColor(Color.WHITE);
		 var x = 100;
		 var y = 15;
        g.fillOval(x, y, 30, 30);
        g.fillOval(x+20 ,y-10, 40, 40);
        g.fillOval(x+40 ,y,  30, 30);
        g.fillOval(x+10 , y+10, 40, 30);

		//cloud 2
		g.setColor(Color.WHITE);
		var yo2 =160;
		var yo =20;
        g.fillOval(x+yo2, y+yo, 30, 30);
        g.fillOval(x+20+yo2 ,y-10+yo, 40, 40);
        g.fillOval(x+40+yo2 ,y+yo,  30, 30);
        g.fillOval(x+10+yo2, y+10+yo, 40, 30);

		//cloud 3
		g.setColor(Color.WHITE);
		var xd =-30;
		var xd2 =70;
        g.fillOval(x+xd, y+xd2, 30, 30);
        g.fillOval(x+20+xd ,y-10+xd2, 40, 40);
        g.fillOval(x+40+xd,y+xd2,  30, 30);
        g.fillOval(x+10+xd, y+10+xd2, 40, 30);


	}

	//可以使用 dy來讓某個軸做偏移 可以先定義一個 變數dy 並且加上數字 範例: var dy = -40; 

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setBackground(Color.BLACK);
		window.setContentPane(new Hut());
		window.setVisible(true);
	}
}