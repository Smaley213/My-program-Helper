package ru.helper.proga;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    // статический метод для чтения файла
    public static void  readTxtFile(String fileName) {

        // блок try/catch необходим, так как в результате
        // чтения файла могут возникнуть ошибки
        try {

            // создаем экземпляр класса FileReader
            FileReader tfr = new FileReader(fileName);
            // создаем в памяти буфер для чтения 8Кб символов за раз
            char[] buffer = new char[8096];

            int chars = tfr.read(buffer);

            // до тех пор пока есть символы в файле, читаем данные
            // и выводим в консоль
            while (chars != -1) {
                System.out.println(String.valueOf(buffer, 0, chars));
                chars = tfr.read(buffer);
            }

            // закрываем файл
            tfr.close();

            // отлавливаем исключение
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
