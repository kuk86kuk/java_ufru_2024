package LABORATORY_WORK_8.Example1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class CreateXMLFile_2 {
    public static void main(String[] args) {
        try {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Иван Иванов", "Менеджер", "50000"));
            employees.add(new Employee("Петр Петров", "Разработчик", "60000"));
            employees.add(new Employee("Сергей Сергеев", "Дизайнер", "55000"));

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("employees");
            doc.appendChild(rootElement);

            for (Employee employee : employees) {
                addEmployeeToXML(doc, rootElement, employee);
            }

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/LABORATORY_WORK_8/Example1/employees.xml"));
            transformer.transform(source, result);
            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addEmployeeToXML(Document doc, Element rootElement, Employee employee) {
        Element employeeElement = doc.createElement("employee");
        rootElement.appendChild(employeeElement);

        Element nameElement = doc.createElement("name");
        nameElement.appendChild(doc.createTextNode(employee.name));
        employeeElement.appendChild(nameElement);

        Element positionElement = doc.createElement("position");
        positionElement.appendChild(doc.createTextNode(employee.position));
        employeeElement.appendChild(positionElement);

        Element salaryElement = doc.createElement("salary");
        salaryElement.appendChild(doc.createTextNode(employee.salary));
        employeeElement.appendChild(salaryElement);
    }
}
