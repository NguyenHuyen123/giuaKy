package ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = sc.nextLine();
        CountString count = new CountString();
        System.out.println("Count the number of capitalized words: " + count.countStrings(str));
        System.out.println("String had Change: " + count.capitalizeInitials(str));
        System.out.println(" Change Dots Initial: "+ count.changeDotsInitial(str));

    }
}
