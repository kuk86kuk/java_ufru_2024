package timus.task_2002;

import java.util.*;

public class task_2002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, String> users = new HashMap<>();
        Set<String> loggedInUsers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("register")) {
                String username = input[1];
                String password = input[2];
                if (users.containsKey(username)) {
                    System.out.println("fail: user already exists");
                } else {
                    users.put(username, password);
                    System.out.println("success: new user added");
                }
            } else if (input[0].equals("login")) {
                String username = input[1];
                String password = input[2];
                if (!users.containsKey(username)) {
                    System.out.println("fail: no such user");
                } else if (!users.get(username).equals(password)) {
                    System.out.println("fail: incorrect password");
                } else if (loggedInUsers.contains(username)) {
                    System.out.println("fail: already logged in");
                } else {
                    loggedInUsers.add(username);
                    System.out.println("success: user logged in");
                }
            } else if (input[0].equals("logout")) {
                String username = input[1];
                if (!users.containsKey(username)) {
                    System.out.println("fail: no such user");
                } else if (!loggedInUsers.contains(username)) {
                    System.out.println("fail: already logged out");
                } else {
                    loggedInUsers.remove(username);
                    System.out.println("success: user logged out");
                }
            }
        }
    }
}