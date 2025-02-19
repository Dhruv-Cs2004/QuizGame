
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainGame {
    public static int exit;
    public static void main(String[] args) throws InterruptedException {
        Timer timer=new Timer();
        TimerTask task=new TimerTask() {
            public void run() {
                exit=1;
                System.out.println("\n"+"****Time Out****");
                System.exit(0);
            }
        };
        for (int i = 6; i > 0; i--) {
            System.out.print("\rStarting in... " + i);
            Thread.sleep(1000);
        }
        timer.schedule(task,30000);
        CallMainGame game=new CallMainGame();
        System.out.println("Welcome to my game" );
        System.out.println("You Only Have 30 Second To Answer");
        Random rand=new Random();
        int start=1;
        int min=1;
        int max=10;
        while (start<=10){
            start++;
            int ex=game.getExit();
            if(exit==1){
                break;
            }
            else {
                if(ex==1){
                    break;
                }
                else {
                    int randCorrect=((min-max+1)+max)+start+1;
                    int get=rand.nextInt(randCorrect);
                    switch (get){
                        case 1-> game.first();
                        case 2-> game.second();
                        case 3-> game.Third();
                        case 4-> game.fourth();
                        case 5-> game.fifth();
                        case 6-> game.sixth();
                        case 7-> game.seventh();
                        case 8-> game.eighth();
                        case 9-> game.ninth();
                        case 10-> game.tent();
                        default -> System.out.println("Wrong");
                    }
                }
            }
        }
        System.out.print("Your total Score is:- ");
        System.out.println(game.getTotal()+"/100");
        int less= game.getTotal();
        if(less<60){
            System.out.println("You Score is Less Than 60 So you Loose");
            Voice();

            System.exit(0);
        }
        else {
            System.out.println("You Win This Game Congregation");
            Winning();
            System.exit(0);
        }
    }
    public static void Voice() {
        try {
            File file = new File("you-lose-game-sound-230514.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            DataLine.Info info = new DataLine.Info(Clip.class, audioStream.getFormat());
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void Winning() {
        try {
            File file = new File("you-win-sequence-1-183948.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            DataLine.Info info = new DataLine.Info(Clip.class, audioStream.getFormat());
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

