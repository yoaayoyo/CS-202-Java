

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import java.util.*;




public class FlowerPower extends JPanel implements KeyListener {
    Garden gn;
	MathProblem mp;
	public static final int WEED = 2;
	public static final int CONTINUE = 0;
	public static final int FLOWER = 1;

	public static final int MAIN_LOOP=1;
	public static final int ENDGAME=2;

	// public int windowHeight = 600;
	// public int windowWidth = 800;

	//public static int plantSound;

	public int gamestate;

	int score=0;
	String myName;
	int chances = 3;


    FlowerPower(int w, int h){ //will always run what's inside the construtor first when game starts
        gn = new Garden(w, h);
	

		mp = new MathProblem();
		addKeyListener(this);
		gamestate=MAIN_LOOP;
		myName = JOptionPane.showInputDialog("What's your name? 你叫啥名字");
	
    }
    

    @Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
        gn.draw(g);
		
        
		if (gamestate==MAIN_LOOP){
			mp.drawtext(g);
		}else{
			g.drawString("Game Overrrrr",getWidth()/2 , getHeight()/2); // set the position of this message in the middle
		}

		g.drawString("score: "+ score, 10, 35);
		g.drawString("Name:"+myName, 10, 75);

		requestFocusInWindow();
	}



    public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800,600);
		window.setContentPane(new FlowerPower(800, 600));
		window.setVisible(true);
	}


	@Override
	public void keyTyped(KeyEvent e) {

			
	}


	@Override
	public void keyPressed(KeyEvent e) {           //when I press a key, it takes it to receiveUserInput and if it is number then display it after equal sign, if it is enter it check if the answer is eqaul to useranswer
			
		if(gamestate==MAIN_LOOP){
			int returnValue = mp.receiveUserInput(e);

			
			if (returnValue==FLOWER){
				score+=10;
				//plantSound = 1;
				gn.newFlower(); 
				if(gn.plants.size() == 16){           // to check the numbers of plants inside the gn to see if it is greater than 16. (using length)
					gamestate=ENDGAME;
				}else{
					mp = new MathProblem();
				}

			}

			else if (returnValue ==WEED){
				
				chances--;                        //Extra credit,  three chances allow to be wrong
				System.out.print("my chances: " + chances);
				if(chances == 0){
					score-=5;
					chances=3;
					//plantSound = 0;
					gn.newWeed();
					if(gn.plants.size() == 16){
						gamestate=ENDGAME;
					}else{
						mp = new MathProblem();
					}
				}
				
			}
			
			else if (returnValue == CONTINUE){
				repaint();
			}
			
				
			repaint();
		}else if(gamestate==ENDGAME){
			char key = Character.toLowerCase(e.getKeyChar());

			if(key == 'y'){
				gamestate=MAIN_LOOP;
				gn.myClear();
			}else if(key == 'n'){
				System.exit(0);
			}
		}
			
	}


	@Override
	public void keyReleased(KeyEvent e) {
			
	}
}


