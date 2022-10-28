// 34: Girilen 4 basamaklı sayının orjinal sayı olup olmadığını bulan program. Orijinal sayı: ilk iki basamağı ile
// son iki basamağının toplamının karesi kendine eşit olan sayı.

import java.util.Scanner;

public class j034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();

        int answer = number/100 + number%100;
        if(answer*answer == number) System.out.println("true");
        else System.out.println("false");

    }
}
