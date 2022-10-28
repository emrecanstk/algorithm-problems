// 33: Kenarları girilen bir üçgenin üçgen olup olmayacağını bulan program.

import java.util.Scanner;

public class j033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        if(a>b+c || b>a+c || c>a+b) System.out.println("false");
        else System.out.println("true");
    }
}
