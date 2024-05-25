package LABORATORY_WORK_8.Example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class JsonDeleteEL {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/LABORATORY_WORK_8/Example2/employees-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("employees");

            String searchLastName = "Иван Иванов"; // Фамилия для поиска и удаления

            // Создание нового JSONArray для обновлённых данных
            JSONArray updatedArray = new JSONArray();

            // Итерация по массиву сотрудников
            for (Object o : jsonArray) {
                JSONObject employee = (JSONObject) o;
                String name = (String) employee.get("name");
                if (!name.equals(searchLastName)) {
                    updatedArray.add(employee);
                }
            }

            // Обновление корневого объекта
            jsonObject.put("employees", updatedArray);

            // Запись обновлённых данных в новый файл
            try (FileWriter file = new FileWriter("src/LABORATORY_WORK_8/Example2/updated_employees-json.json")) {
                file.write(jsonObject.toJSONString());
                System.out.println("Обновлённые данные успешно записаны в файл updated_employees-json.json");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
