package LABORATORY_WORK_7.Example1_2.task6;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/LABORATORY_WORK_7/Example1_2/task6/input.txt";
        String outputFileName = "src/LABORATORY_WORK_7/Example1_2/task6/output.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
