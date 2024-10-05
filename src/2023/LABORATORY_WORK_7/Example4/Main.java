package LABORATORY_WORK_7.Example4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/LABORATORY_WORK_7/Example4/input.txt");
        FileWriter writer = new FileWriter("src/LABORATORY_WORK_7/Example4/output.txt");
        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }
        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}