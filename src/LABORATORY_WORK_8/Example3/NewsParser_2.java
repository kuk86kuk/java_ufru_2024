package LABORATORY_WORK_8.Example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class NewsParser_2 {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");

            // Путь к файлу, в который будут записываться данные
            String filePath = "src/LABORATORY_WORK_8/Example3/news_data.txt";

            // Используем try-with-resources для автоматического закрытия FileWriter
            try (FileWriter writer = new FileWriter(filePath)) {
                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        Element newsItem = (Element) nodes.get(i);

                        // Запись темы новости
                        writer.write("Тема: " +
                                newsItem.getElementsByClass("blocktitle").get(0).childNodes().get(0) + "\n");

                        // Запись даты новости
                        writer.write("Дата: " +
                                newsItem.getElementsByClass("blockdate").get(0).childNodes().get(0) + "\n\n");
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}