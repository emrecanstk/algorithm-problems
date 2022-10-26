// 29: Girilen yılın artık yıl olup olmadığını bulan program. Artık yıl: 4'ün katı olup da 100'ün katı olmayan yıllar.

import java.util.Scanner;

public class j029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("year: ");
        int year = scanner.nextInt();
        if(year%4==0 && year%100!=0) {
            System.out.println("true");
        }
        else System.out.println("false");

    }
}
