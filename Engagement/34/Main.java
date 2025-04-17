import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {

    private ArrayList<Pokemon> pokestop = new ArrayList<>();

    public Main() {
        var p1 = new Pokemon("Pichu",68);
        var p2 = new Pokemon("Charmander",50);
        pokestop.add(p1);
        pokestop.add(p2);
    }
     
    public static void main (String[] args){
         
        var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setBackground(Color.BLACK);
		window.setContentPane(new Hut());
		window.setVisible(true);

    }
}