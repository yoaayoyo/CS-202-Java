

import javax.swing.ImageIcon;
import java.util.Random;


public class Flower extends Plant {
	
    //建構子   1C
	public Flower(int x, int y) {
        super( x, y);
        
        String[] flo = {"flower0-1.png","flower1-1.png","flower2-1.png","flower3-1.png"};

        // 創建 random  物件
        Random rand = new Random();

        //將這個值儲存至我們在field 的image裡面 並且執行一個 從 flo array的範圍裡面的隨機抽取.
        image = new ImageIcon(flo[rand.nextInt(flo.length)]);       

	}

}
