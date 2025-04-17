import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

import java.io.File;
import java.util.Scanner;

import java.io.FileNotFoundException;

public class ArrayLab2 extends JPanel {

    String fl [];
    double sum[];
    int aVGCounter = 0;
    
    //宣告最大值 和以下找出最大值對應
    double max = 0;
   

	public ArrayLab2() {



        // Read inside the file.

		String filename = JOptionPane.showInputDialog("enter filename");
        File f = new File (filename);
        
        //
        int counter = 0;
        
        try {
        // read the first line
        Scanner s = new Scanner(f);
		String firstline = s.nextLine();
        fl = firstline.split(",");

        int n = fl.length-1;
        sum = new double[n];
        
           
            while(s.hasNext()){
            String yo = s.nextLine();
            String[] hey= yo.split(",");

            for (int i=1;i<hey.length;i++){
                sum[i-1]+= Double.parseDouble(hey[i]);
                
            
            }//
             counter++;
        
            
            } 
            s.close();
            }catch (FileNotFoundException e){
                System.out.println("Cound not find "+filename);
            }
            // 平均總數
            for (int i=0; i<sum.length;i++){
                sum[i] /= counter;
                System.out.println(sum[i]);
            } 
            aVGCounter = counter;
            //找出最大值
            //這裡用的是 Enhance for loop, 括號裡面必須加入 type var名 以及 array.
            for (double ss : sum){            // ss代表的是 sum array裡面的某一個值
                if(ss>max) {                  // 如果 ss的值大於 max = 0 
                    max=ss;                   //由於每一個值都會大於0 所以電腦就會自動挑選所有值中最大的
                }
            } 
        }
        


	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Ensure proper repainting
    
        int w = getWidth();
        int h = getHeight();
    
        int barHeight = h / sum.length; // Distribute bars evenly
        
        for (int i = 0; i < sum.length; i++) {
            int barWidth = (int) ((sum[i] / max) * w); // Compute width proportionally
    
            if(i == 0){
                g.setColor(Color.GREEN);
            }else if(i == 1){
                g.setColor(Color.BLUE);
            }else{
                g.setColor(Color.RED);
            }   
            g.fillRect(0, i * barHeight + (barHeight / 4), barWidth, barHeight / 2);  // Draw bars
    
            g.setColor(Color.BLACK);
            g.drawString(fl[i + 1], 10, i * barHeight + barHeight / 2);  // Draw labels
            String sumLabel = String.valueOf(sum[i]);
            g.drawString(sumLabel, barWidth-30, i * barHeight + barHeight / 2);
        }
    }
    

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800,800);
		window.setContentPane(new ArrayLab2());
		window.setVisible(true);
	}
}
