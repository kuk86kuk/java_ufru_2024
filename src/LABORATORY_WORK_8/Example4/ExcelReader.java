package LABORATORY_WORK_8.Example4;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        String filePath = "src/LABORATORY_WORK_8/Example4/example.xlsx";
        int maxAttempts = 3;
        int attempt = 0;

        while (attempt < maxAttempts) {
            try {
                FileInputStream fis = new FileInputStream(filePath);
                Workbook workbook = WorkbookFactory.create(fis);
                Sheet sheet = workbook.getSheetAt(0); // Предполагаем, что нужен первый лист
                // Обработка листа...
                fis.close();
                System.out.println("Данные успешно прочитаны.");
                break;
            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + e.getMessage());
                System.err.println("Пожалуйста, проверьте путь к файлу и его наличие на диске.");
                attempt++;
            } catch (Exception e) {
                System.err.println("Произошла ошибка: " + e.getMessage());
                attempt++;
            }

            if (attempt < maxAttempts) {
                System.out.println("Повторная попытка через 5 секунд...");
                try {
                    Thread.sleep(5000); // Пауза между попытками
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Не удалось прочитать файл после " + maxAttempts + " попыток.");
            }
        }
    }
}