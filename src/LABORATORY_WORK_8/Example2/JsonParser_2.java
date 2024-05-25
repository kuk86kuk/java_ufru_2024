package LABORATORY_WORK_8.Example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonParser_2 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/LABORATORY_WORK_8/Example2/employees-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("employees");

            String searchLastName = "Иван Иванов"; // Фамилия для поиска

            for (Object o : jsonArray) {
                JSONObject employee = (JSONObject) o;
                String name = (String) employee.get("name");
                if (name.equals(searchLastName)) {
                    System.out.println("Имя сотрудника: " + name);
                    System.out.println("Должность: " + employee.get("position"));
                    System.out.println("Зарплата: " + employee.get("salary"));
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
