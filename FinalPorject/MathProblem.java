    import java.util.Random;

    import javax.swing.JPanel;

    import java.awt.*;
    import java.awt.event.KeyEvent;
    import java.awt.event.KeyListener;
    import java.util.*;

    public class MathProblem implements KeyListener{
        private int num1;
        private int num2;
        private int answer;
        private int operator;
        String userInput;


        public MathProblem(){
            userInput = "";

            Random rand = new Random();
            num1 = rand.nextInt(13); 
            num2 = rand.nextInt(13);
            answer = num1 + num2;
            System.out.println("answer: " +answer);

            //設置選擇哪一種operator的條件
            operator = rand.nextInt(4)+1;  //隨機從1~4選擇 最後面的 +1 是代表 1開始而不是從0開始

            // addition
            if (operator ==1){
                answer = num1 + num2;

            // subtraction
            }else if(operator == 2){
                while(num1 < num2){
                    num1 = rand.nextInt(13); 
                    num2 = rand.nextInt(13);
                    if(num1 >= num2){
                        answer = num1 - num2;
                        break;
                    }
                }


                //division FIXＴＨＩＳ
            }else if (operator ==3){
                if(num2 == 0){
                    num2 = 1;
                }
                int product = num1 * num2;
                answer = num1;
                num1 = product;
                    
                if (num1 %2 == 0){
                    if(num2 %2 == 0){

                    }else{
                        num2 += 1;
                    }
                    
                }


                

                

                answer = num1 / num2;
            // multiplication　ＦＩＸTHIS
            }else if (operator == 4){
                answer = num1 * num2;
            }
        
        }

        public int receiveUserInput(KeyEvent ke){
            char myChar = ke.getKeyChar();
            if (userInput.length() <3){
                if (myChar == '0'){
                    userInput+=myChar;
                }else if(myChar == '1'){
                    userInput+=myChar;
                }
                else if(myChar == '2'){
                    userInput+=myChar;
                }
                else if(myChar == '3'){
                    userInput+=myChar;
                }
                else if(myChar == '4'){
                    userInput+=myChar;
                }
                else if(myChar == '5'){
                    userInput+=myChar;
                }
                else if(myChar == '6'){
                    userInput+=myChar;
                }
                else if(myChar == '7'){
                    userInput+=myChar;
                }
                else if(myChar == '8'){
                    userInput+=myChar;
                }
                else if(myChar == '9'){
                    userInput+=myChar;
                }
            }
            

            
            
            int keyCode = ke.getKeyCode();
            if (keyCode == KeyEvent.VK_ENTER){
                String stringAnswer = "" +answer;
            
                if(userInput.equals(stringAnswer)){
                    return 1;
                } else{
                    return 2;
                }
            }
            if (keyCode == KeyEvent.VK_BACK_SPACE || keyCode == KeyEvent.VK_DELETE) {
                if (!userInput.isEmpty()) {
                    userInput = userInput.substring(0, userInput.length() - 1);
                    System.out.println("backspace on userinput");
                }
            }
            return 0;
        }

        public void drawtext(Graphics g){

            //字體大小
            Font font = new Font("Serif", Font.PLAIN, 50);
            g.setFont(font);


            if(operator == 1){
            g.drawString(num1 +" + " + num2 + " = " + userInput,800/2,600/2);
            }
            else if (operator == 2){
                g.drawString(num1 +" - " + num2 + " = "+userInput,800/2,600/2);
            }
            else if (operator ==3){
                g.drawString(num1 +" / " + num2 + " = "+userInput,800/2,600/2);
            
            }
            else if (operator ==4){
                g.drawString(num1 +" * " + num2 + " = "+userInput,800/2,600/2);
            }
            
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
            //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
        }
    }
