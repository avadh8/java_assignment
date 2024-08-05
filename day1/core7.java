package day1;

import java.util.Scanner;

public class core7 {

    public static int countDigit(int number) {

        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter number (wihtin 5 digit)");
        int number = sc.nextInt();

        if (number <= 0 || number > 100000) {

            System.out.println("Invalid input");

        } else {

            int digiCount = countDigit(number);

            System.out.println("Number of digits in the number: " + digiCount);

        }

    }
}
