package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        int sums = 0;
        for (String number : numbers) {
            sums += Integer.parseInt(number);
        }

        System.out.println(sums);
        scanner.close();
    }
}
