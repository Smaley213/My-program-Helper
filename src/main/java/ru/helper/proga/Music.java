package ru.helper.proga;


import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Music {

    public static void playM() throws FileNotFoundException {

        try {
            System.out.println(" Song is playing now =) ");
            FileInputStream fileInputStream = new FileInputStream("C:\\helper\\src\\main\\resources\\Cyberpunk_2077.mp3");
            Player player = new Player((fileInputStream));
            player.play();
            System.out.println(" Song is played ");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
           /* JOptionPane.showMessageDialog(null,"Нажмите ОК для Остановить трек ");

         https://habr.com/ru/sandbox/42721/   Java Media Player

        https://ru.stackoverflow.com/questions/560361/Музыка-в-javamp3


         https://jazzteam.org/ru/technical-articles/support-of-mp3-and-wav-format-files-playback-in-java/


          */



