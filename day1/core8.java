package day1;

import java.util.Scanner;

public class core8 {

    public static void main(String[] args) {
        int letters = 0;
        int space = 0;
        int digit = 0;
        int other = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {

                digit++;

            } else if (Character.isLetter(ch)) {

                letters++;

            } else if (Character.isWhitespace(ch)) {

                space++;

            } else {

                other++;

            }

        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + space);
        System.out.println("Numbers: " + digit);
        System.out.println("Other characters: " + other);

        sc.close();
    }

}
