package day1;

import java.util.Scanner;

public class core4 {

    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number ");
            int n = sc.nextInt();

            sum += n;

        }
        System.out.println("the sum is " + sum);

    }

}
