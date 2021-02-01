package ru.helper.proga;

import java.awt.*;
import java.io.IOException;

import java.net.URISyntaxException;
import java.net.URL;

public class Url {


    public static void openBrowser() throws URISyntaxException {
        Desktop desktop;
        try {
            desktop = Desktop.getDesktop();
        } catch (Exception ex) {
            System.err.println("Класс Desktop не поддерживается.");
            return;
        }
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            System.err.println("BROWSE: операция не поддерживается..");
            return;
        }
        // если все ок пытаемся открыть ссылку
        try {
            desktop.browse(new URL("https://yandex.by/").toURI());
        } catch (IOException ex) {
            System.err.println("Failed to browse. " + ex.getLocalizedMessage());
        }
    }

    public static void openBrowser2() throws URISyntaxException {
        Desktop desktop;
        try {
            desktop = Desktop.getDesktop();
        } catch (Exception ex) {
            System.err.println("Класс Desktop не поддерживается.");
            return;
        }
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            System.err.println("BROWSE: операция не поддерживается..");
            return;
        }
        // если все ок пытаемся открыть ссылку
        try {
            desktop.browse(new URL("https://myfin.by/currency/minsk").toURI());
        } catch (IOException ex) {
            System.err.println("Failed to browse. " + ex.getLocalizedMessage());
        }
    }

    public static void openBrowser3() throws URISyntaxException {
        Desktop desktop;
        try {
            desktop = Desktop.getDesktop();
        } catch (Exception ex) {
            System.err.println("Класс Desktop не поддерживается.");
            return;
        }
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            System.err.println("BROWSE: операция не поддерживается..");
            return;
        }
        // если все ок пытаемся открыть ссылку
        try {
            desktop.browse(new URL("https://yandex.by/news/?utm_source=main_stripe_big").toURI());
        } catch (IOException ex) {
            System.err.println("Failed to browse. " + ex.getLocalizedMessage());
        }
    }

    public static void openBrowser4() throws URISyntaxException {
        Desktop desktop;
        try {
            desktop = Desktop.getDesktop();
        } catch (Exception ex) {
            System.err.println("Класс Desktop не поддерживается.");
            return;
        }
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            System.err.println("BROWSE: операция не поддерживается..");
            return;
        }
        // если все ок пытаемся открыть ссылку
        try {
            desktop.browse(new URL("https://yandex.by/maps/157/minsk/?from=tabbar&ll=27.561481%2C53.902496&z=12").toURI());
        } catch (IOException ex) {
            System.err.println("Failed to browse. " + ex.getLocalizedMessage());
        }
    }


}




     // http://espressocode.top/url-class-java-examples/  //------ О ссылках на сайты

    // https://leodev.ru/blog/java/открываем-браузер-в-windows-mac-или-linux-с-помощью-java/    // ----О ссылках на сайты

