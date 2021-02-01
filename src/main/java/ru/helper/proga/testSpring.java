package ru.helper.proga;

import java.io.IOException;

public class testSpring {
    public static void main(String[] args) throws IOException {


        Menu menu = new Menu();
        menu.run();


    }
}


    // OLD---------------------------------------------------------
    /*   while(true) {
           Hello.hi();


           System.out.println("Выберите то что нужно ! ");

           Select.selection();

           System.out.println("Что нибудь еще нужно ? ");

          // Yesno.selection();


           Scanner sc=new Scanner(System.in);
           String choice=sc.nextLine();
           if (choice!="y") {
              break;
           }

       }
       Hello.buy();



       package ru.helper.proga;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;




public class Select {

    public static void selection(){

        System.out.println("---> Выберите Y - Яндекс (поиск)  ");
        System.out.println("---> Выберите V - Курс валют  ");
        System.out.println("---> Выберите N - Новости  ");
        System.out.println("---> Выберите M - Карты (Наигация)  ");
        System.out.println("---> Выберите L - Любимый трек (Музыка)  ");
        Scanner scan = new Scanner(System.in);
        String a ;
        a = scan.nextLine();

        switch (a) {
            case "y":
                try {
                    Url.openBrowser();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            case "v":
                try {
                    Url.openBrowser2();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            case "n":
                try {
                    Url.openBrowser3();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            case "m":
                try {
                    Url.openBrowser4();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            case "l":
                try {
                    Music.playM();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                break;
            default:
                System.out.println("Вы ничего не выбрали !");
        }
    }


}
*/




