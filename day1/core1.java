package day1;

import java.util.Scanner;

public class core1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();

        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is largest");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is largest ");
        } else {
            System.out.println(n3 + " is largest");
        }
        sc.close();
    }

}
