
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics; //paintComponent(Graphics g) 裡面的Graphics 需要被import 但是paintComponent是屬於Jpanel的 所以已經被import了
//以上上面這三個 都是需要把class從他們的資料庫被匯入的 所以才使用 import.


public class Tue114 extends JPanel{ // class name starts with uppercase letter


    @Override   //這代表我們在覆寫 從資料庫import進來的類別 是為了定制或修改從父類別繼承來的方法行為 不然我們只能使用他預設的樣子
    public void paintComponent(Graphics g){
        g.drawString("CS202 is my favorite class",10,10);  //左邊的10是從 10px往左延伸，右邊的10 是從上面到下面延伸10px
        g.drawString("yooo I want to eat something",10,30);  //第二行
    }

    public static void main(String[] args) {
        var Window = new JFrame();  //創建一個新視窗
        Window.setSize(200,200);    //設定視窗大小
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //這個必須加上去才能讓視窗有關閉的功能
        Window.setContentPane(new Tue114());   //這個能讓你的字或是內容在上面顯示
        Window.setVisible(true);   // 這個功能讓你的視窗可視化或者 如果在後面打上false那麼就會不可視
    
    }

}