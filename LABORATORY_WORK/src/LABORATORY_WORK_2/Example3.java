package LABORATORY_WORK_2;

import java.util.Scanner;


public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования (англ.): ");
        String text = scanner.nextLine();
        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
        scanner.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) (((character - base + key) % 26) + base));
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key);
    }
}