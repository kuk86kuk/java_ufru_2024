package LABORATORY_WORK_8.Example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewsParser_3 {
    public static void main(String[] args) {
        int maxAttempts = 5; // Максимальное количество попыток подключения
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

                Elements newsParent = doc
                        .select("body > table > tbody > tr > td > div > table > " +
                                "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                                "tr > td:nth-child(1)");

                String filePath = "src/LABORATORY_WORK_8/Example3/news_data.txt";
                try (FileWriter writer = new FileWriter(filePath)) {
                    for (int i = 3; i < 20; i++) {
                        if (!(i % 2 == 0)) {
                            List<Node> nodes = newsParent.get(0).childNodes();
                            Element newsItem = (Element) nodes.get(i);

                            writer.write("Тема: " +
                                    newsItem.getElementsByClass("blocktitle").get(0).childNodes().get(0) + "\n");
                            writer.write("Дата: " +
                                    newsItem.getElementsByClass("blockdate").get(0).childNodes().get(0) + "\n\n");
                        }
                    }
                }

                System.out.println("Данные успешно получены и записаны в файл.");
                break; // Выход из цикла, если подключение успешно

            } catch (IOException e) {
                if (attempt < maxAttempts) {
                    System.out.println("Не удалось подключиться к сайту. Попытка " + attempt + " из " + maxAttempts + ". Повторная попытка через 5 секунд...");
                    try {
                        Thread.sleep(5000); // Пауза между попытками
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.println("Не удалось подключиться к сайту после " + maxAttempts + " попыток.");
                }
            }
        }
    }
}