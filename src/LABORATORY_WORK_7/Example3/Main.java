package LABORATORY_WORK_7.Example3;


import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/LABORATORY_WORK_7/Example3/input.txt";
        BufferedReader reader =
                new BufferedReader(
                        new FileReader(fileName));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Количество строк в файле: " + lineCount);
    }
}