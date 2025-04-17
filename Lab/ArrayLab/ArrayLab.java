package Lab.ArrayLab;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ArrayLab extends JPanel {

	String fl[];
	int sum[];
	int total;
	
	public ArrayLab() {

		//set the path to the file
		String base = "C:\\CS202 Java\\Lab\\ArrayLab\\";
		String userInput = JOptionPane.showInputDialog("Please Creat a filename");

		File f = new File(base + userInput);

		try{
			
			//scan the first line

			Scanner s = new Scanner(f);
			String line = s.nextLine();
			
			fl = line.split(",");

			sum = new int[fl.length];
			for (int i = 0; i < fl.length; i++){
				sum[i] = 0;
			}

			while (true) {
				line = s.nextLine();
				if (line.isEmpty()){
					break;
				}


			}



			total = 0;

			for (int i = 1; i<fl.length; i++){
			

			}
			

			s.close();

		} catch(FileNotFoundException e ){
			System.out.println("not found");
			e.printStackTrace();
		}
	}


    
	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new ArrayLab());
		window.setVisible(true);
	}
}