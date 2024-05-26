package timus.Task_1639;

import java.util.Scanner;

public class Task_1639 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println((m * n) % 2 == 0 ? "[:=[first]" : "[second]=:]");
        }
}