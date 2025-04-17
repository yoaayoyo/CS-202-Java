


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MethodLab extends JPanel {

	ArrayList <String> english2;
	ArrayList <String> chinese;

	
	 public MethodLab() {
	 	loadEnglishWords();
      	loadFrenchWords();
      	mainLoop();
		//lookup("duck");
		
	 }


    //This method will load the words from the english.txt
	public void loadEnglishWords(){ 

		String filename = "chinese.txt";
		File f = new File(filename);

		try{		
			Scanner s = new Scanner(f);	          //掃描檔案裡面的所有東西 然後進行下一句
			chinese = new ArrayList<>();        // 這裡的 english 和 在 feild宣告的 arraylist 相呼應 然後進行下一句

			while (s.hasNextLine()){             //這個代碼會去確認是否還有 "下一行存在" 如果有 那就是 ture.
			chinese.add(s.nextLine());      // 這段代碼就只是去loop所有的在檔案裏面的字串 然後 使用 .add來一個一個加入進我們的arrayList.
				
			}
			System.out.println(chinese);
			s.close();
		} catch(FileNotFoundException e ){
			System.out.println("could not find anything" + filename);
		} 
	}
	
    
	//This method will load the words from the french.txt
	public void loadFrenchWords(){

		String filename = "english2.txt";
		File f1 = new File (filename);
		english2 = new ArrayList<>();

		try{
			Scanner s = new Scanner(f1);
			
			while (s.hasNextLine()){
				english2.add (s.nextLine());
				
			}
			System.out.println(english2);
			s.close();
		} catch(FileNotFoundException e1 ){
			System.out.println("count not find anything"+ filename);
		}
		
	}

	 

	//This method takes a single String parameter
	public String lookup (String word){
		for ( int i=0; i<chinese.size();i++){  //從 0開始， i<Filanem.size() 是告訴java要掃描的範圍只要跟檔案大小一樣就行了，i只要大小沒超出 english.txt 就繼續
			if (word.equals(chinese.get(i))){  //這裡表示如果 輸入的字串 .eqauls eng;ish檔案裡面的任一個字 以(i)來表示掃描裡面的任意內容來抓出那個相同的字
				word = english2.get(i);          //接者就會進行這一行 也就是 剛剛的 找到的相符的結果 也等於 french file 裡面相同位置的字串 (i) 還是用這個表示
												//用 get 來抓取
				System.out.println(word);
				return word;
			}
		}

		System.out.println("no match found bruh");
		word = "no match found bruh";
		return word;
	}


	//This method consists of a while (true) loop.
	public void mainLoop(){
		while(true){                           //這邊的while(true) 並不是在執行檔案裏面資料的迴圈 而是以下整個操作的重複執行.
			String input =JOptionPane.showInputDialog("Enter an Chinese word: ");
			String result = lookup(input);

			int choice = JOptionPane.showConfirmDialog(null, "Your English word is: " + result + ". Would you like to play again.","Yo", JOptionPane.YES_NO_OPTION);
			
			if (choice == JOptionPane.NO_OPTION) { 
				break;
			}
		}
			
	} 

	public static void main (String [] args){
		new MethodLab();
	}	
}
