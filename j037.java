// 37: 4 haneli bir sayının basamaklarını bulan program.

import java.util.Scanner;

public class j037 {
    public static void main(String[] args) {
        System.out.print("number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while(number>0) {
            System.out.println(number%10);
            number/=10;
        }
    }
}
