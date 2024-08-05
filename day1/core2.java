package day1;

import java.util.Scanner;

public class core2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character : ");
        String input = sc.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Please enter a single character.");
        } else {
            char ch = sc.next().charAt(0);

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("vowel...");
                } else {
                    System.out.println("character...");
                }
            }

            else {
                System.out.println("Error: Please enter a valid letter (a-z or A-Z).");
            }
        }

    }

}