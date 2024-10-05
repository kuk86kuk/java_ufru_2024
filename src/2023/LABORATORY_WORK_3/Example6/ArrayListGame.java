package LABORATORY_WORK_3.Example6;
import java.util.ArrayList;
public class ArrayListGame {
    public static void main(String[] args) {
        int N = 10; // Количество человек в кругу
        ArrayList<Integer> circle = new ArrayList<>();

        // Заполняем круг
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int currentIndex = 0;
        while (circle.size() > 1) {
            // Вычеркиваем каждого второго человека
            currentIndex = (currentIndex + 1) % circle.size();
            circle.remove(currentIndex);
        }

        // Выводим оставшегося человека
        System.out.println("Остался человек под номером: " + circle.get(0));
    }
}