import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class test {
    public static void main(String[] args) {
        Scanner sc  =   new Scanner(System.in);
        String correctname  =   "Pisay";

        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        if (username.equals(correctname) || (username.equalsIgnoreCase(correctname))) {
            System.out.println("Authorized User!");
        }

        else {
            System.out.println("WEEWOO INTRUDER");
        }

        filepath = "Rick Rolled (Short Version) [BBJa32lCaaY].webm";
        SimpleAudioPlayer audioPlayer = 
                            new SimpleAudioPlayer();
              
            audioPlayer.play();
              
            while (true)
            {
                System.out.println("1. pause");
                System.out.println("2. resume");
                System.out.println("3. restart");
                System.out.println("4. stop");
                System.out.println("5. Jump to specific time");
                int c = sc.nextInt();
                audioPlayer.gotoChoice(c);
                if (c == 4)
                break;
            }
    }
}