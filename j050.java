// 50: İki dik kenarı ve aradaki açısı girilen üçgenin alanını hesaplayan program.

import java.util.Scanner;

public class j050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("A^B: ");
        int ab = scanner.nextInt();

        System.out.println((a*b*Math.sin(Math.toRadians(ab)))/2);
    }
}
