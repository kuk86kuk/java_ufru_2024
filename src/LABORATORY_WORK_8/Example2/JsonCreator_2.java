package LABORATORY_WORK_8.Example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JsonCreator_2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван Иванов", "Менеджер", 50000));
        employees.add(new Employee("Петр Петров", "Разработчик", 60000));
        employees.add(new Employee("Сергей Сергеев", "Дизайнер", 55000));

        JSONObject employeesJson = new JSONObject();
        JSONArray employeeList = new JSONArray();

        for (Employee employee : employees) {
            JSONObject employeeJson = new JSONObject();
            employeeJson.put("name", employee.name);
            employeeJson.put("position", employee.position);
            employeeJson.put("salary", employee.salary);
            employeeList.add(employeeJson);
        }

        employeesJson.put("employees", employeeList);

        try (FileWriter file = new FileWriter("src/LABORATORY_WORK_8/Example2/employees-json.json")) {
            file.write(employeesJson.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}