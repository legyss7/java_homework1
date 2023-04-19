package org.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        System.out.println(reverseWords(s));
        scanner.close();
    }
    public static String reverseWords(String s) {
        StringBuilder newStr = new StringBuilder();
        String[] words = s.trim().replaceAll("( )+", " ").split(" ");
        for (int i = words.length - 1; i >= 0 ; i--) {
            newStr.append(words[i]).append(" ");
        }
        return newStr.toString();
    }
}
