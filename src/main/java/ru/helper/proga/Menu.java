package ru.helper.proga;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Scanner;

import static ru.helper.proga.ReadFile.readTxtFile;

public class Menu {

    private void hi() {
        System.out.println(" Привет это ваш помощник !");
        System.out.println(" Чем помочь ?");
    }
    static void selection(){






        System.out.println("Выберите то что нужно ! ");

        System.out.println("---> Выберите Y - Яндекс (поиск)  ");
        System.out.println("---> Выберите V - Курс валют  ");
        System.out.println("---> Выберите N - Новости  ");
        System.out.println("---> Выберите M - Карты (Наигация)  ");
        System.out.println("---> Выберите T - Любимый трек (Музыка)  ");
        System.out.println("---> Выберите l - Плеер (Музыка)  ");
        System.out.println("---> Выберите P - Приложение ( Lightroom )  ");
            System.out.println("---> Выберите I - Инструкция пользователю !!!! ");

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
            case "t":
                try {
                    Music.playM();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                break;
            case "l":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\AIMP\\AIMP.exe");              // ?????
                } catch (IOException e) {
                    e.printStackTrace();

                }
            case "p":

                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Adobe\\Adobe Lightroom Classic CC\\Lightroom.exe");   // ?????????? Start 2 program
                } catch (IOException e) {
                    e.printStackTrace();
                }
            case "i":

                System.out.println("  Инструкция как использовать приложение ! (Ниже) ");

                readTxtFile("C:\\helper\\src\\main\\resources\\Instruction");

                break;
            default:
                System.out.println("Вы ничего не выбрали !");
        }

            System.out.println(" Еще что-то запустить ?!");
        Yesno.selection();
      }



    private  void buy () {
        System.out.println(" До скорой встречи !");
    }

    public void run() throws IOException {
        while(true) {
            hi();
           selection();
          Scanner sc=new Scanner(System.in);
            String choice=sc.nextLine();
            if (choice!="y") {
                break;
            }

            buy();




        }

    }

}
