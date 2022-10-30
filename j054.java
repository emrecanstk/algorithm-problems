// 54: Dışarıdan derece olarak girilen değeri radyana çeviren program.

import java.util.Scanner;

public class j054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        double number = scanner.nextInt();
        System.out.println(number/180+" pi");
    }
}
