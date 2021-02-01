package ru.helper.proga;


import java.util.Scanner;



public class Yesno {

    public static void selection(){

        System.out.println("---> Выберите Y - N  ");

        Scanner scan = new Scanner(System.in);
        String a ;
        a = scan.nextLine();
        switch (a) {

            case "y":
                Menu.selection();
                break;
            case "n":
                break;

        }
    }
}
