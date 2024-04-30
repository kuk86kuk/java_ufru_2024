package LABORATORY_WORK_5;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;



public class Example6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));
        System.out.println("Общие элементы: " + Arrays.toString(commonElements));
    }

    private static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
        Set<Integer> commonSet = new HashSet<>(set1);
        commonSet.retainAll(set2);
        return commonSet.stream().mapToInt(Integer::intValue).toArray();
    }
}