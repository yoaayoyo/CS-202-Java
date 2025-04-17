import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundPlayer {
    public static void playExplosion() {
        try {
            
            File f = new File("win.wav");

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(f); // May throw UnsupportedAudioFileException
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("The audio file format is not supported.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("There was an IO error.");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Audio line for playback is unavailable.");
            e.printStackTrace();
        }



    }
    public static void playother() {
        try {
            
            File f = new File("lose.wav");

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(f); // May throw UnsupportedAudioFileException
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("The audio file format is not supported.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("There was an IO error.");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Audio line for playback is unavailable.");
            e.printStackTrace();
        }



    }



        
}
