package LABORATORY_WORK_3;
import java.util.*;
import java.util.function.Consumer;



public class CollectionPerformanceTest {
    public static void main(String[] args) {
        int numElements = 100000; // Количество элементов в коллекциях

        // Создание коллекций
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();

        // Заполнение коллекций
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
            linkedList.add(i);
            treeSet.add(i);
        }

        // Замеры времени выполнения операций
        System.out.println("Добавление элемента в начало коллекции:");
        measureAddToStart(arrayList, linkedList, treeSet);

        System.out.println("\nДобавление элемента в конец коллекции:");
        measureAddToEnd(arrayList, linkedList, treeSet);

        System.out.println("\nДобавление элемента в середину коллекции:");
        measureAddToMiddle(arrayList, linkedList, treeSet);

        System.out.println("\nУдаление элемента в начале коллекции:");
        measureRemoveFromStart(arrayList, linkedList, treeSet);

        System.out.println("\nУдаление элемента в конце коллекции:");
        measureRemoveFromEnd(arrayList, linkedList, treeSet);

        System.out.println("\nУдаление элемента в середине коллекции:");
        measureRemoveFromMiddle(arrayList, linkedList, treeSet);

        System.out.println("\nПолучение элемента по индексу:");
        measureGetByIndex(arrayList, linkedList, treeSet);
    }

    private static void measureAddToStart(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> treeSet) {
        measureOperation(arrayList, linkedList, treeSet, "ArrayList", "LinkedList", "TreeSet", CollectionPerformanceTest::addToStart);
    }

    private static void measureAddToEnd(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> treeSet) {
        measureOperation(arrayList, linkedList, treeSet, "ArrayList", "LinkedList", "TreeSet", CollectionPerformanceTest::addToEnd);
    }

    private static void measureAddToMiddle(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> treeSet) {
        measureOperation(arrayList, linkedList, treeSet, "ArrayList", "LinkedList", "TreeSet", CollectionPerformanceTest::addToMiddle);
    }

    private static void measureRemoveFromStart(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> treeSet) {
        measureOperation(arrayList, linkedList, treeSet, "ArrayList", "LinkedList", "TreeSet", CollectionPerformanceTest::removeFromStart);
    }

    private static void measureRemoveFromEnd(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> treeSet) {
        measureOperation(arrayList, linkedList, treeSet, "ArrayList", "LinkedList", "TreeSet", CollectionPerformanceTest::removeFromEnd);
    }

    private static void measureRemoveFromMiddle(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> treeSet) {
        measureOperation(arrayList, linkedList, treeSet, "ArrayList", "LinkedList", "TreeSet", CollectionPerformanceTest::removeFromMiddle);
    }

    private static void measureGetByIndex(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> treeSet) {
        measureOperation(arrayList, linkedList, treeSet, "ArrayList", "LinkedList", "TreeSet", CollectionPerformanceTest::getByIndex);
    }

    private static void measureOperation(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> treeSet,
                                         String arrayListName, String linkedListName, String treeSetName,
                                         Consumer<List<Integer>> arrayListOperation) {
        long startTime = System.nanoTime();
        arrayListOperation.accept(arrayList);
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        arrayListOperation.accept(linkedList);
        long linkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        arrayListOperation.accept(new ArrayList<>(treeSet)); // TreeSet не поддерживает индексацию
        long treeSetTime = System.nanoTime() - startTime;

        System.out.printf("%s: %d ns%n", arrayListName, arrayListTime);
        System.out.printf("%s: %d ns%n", linkedListName, linkedListTime);
        System.out.printf("%s: %d ns%n", treeSetName, treeSetTime);
    }

    private static void addToStart(List<Integer> list) {
        list.add(0, -1);
    }

    private static void addToEnd(List<Integer> list) {
        list.add(list.size(), -1);
    }

    private static void addToMiddle(List<Integer> list) {
        list.add(list.size() / 2, -1);
    }

    private static void removeFromStart(List<Integer> list) {
        list.remove(0);
    }

    private static void removeFromEnd(List<Integer> list) {
        list.remove(list.size() - 1);
    }

    private static void removeFromMiddle(List<Integer> list) {
        list.remove(list.size() / 2);
    }

    private static void getByIndex(List<Integer> list) {
        list.get(list.size() / 2);
    }
}