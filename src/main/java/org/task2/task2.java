package org.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countDiff(scanner));
        scanner.close();
    }

    public static int countDiff(Scanner scanner) {
        int count = 0;
        int a;
        int b = 0;
        do {
            a = scanner.nextInt();
            if(a >= 0) b = a;
            else count += b;
        } while (a != 0);
        return count;
    }
}
