package timus.task_1264;
import java.util.Scanner;



public class task_1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int numChecks = n * (m + 1);
        int numSeconds = numChecks;
        System.out.println(numSeconds);
    }
}