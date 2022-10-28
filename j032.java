// 32: Kenarları A,B,C ve D olan dikdörtgenin kare olup olmadığını bulan program.

import java.util.Scanner;

public class j032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();
        System.out.print("D: ");
        int d = scanner.nextInt();

        if(a==b && b==c && c==d) System.out.println("true");
        else System.out.println("false");
    }
}
