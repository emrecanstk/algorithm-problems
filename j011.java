// 11: Girilen üç basamaklı bir sayının basamaklarının küplerinin toplamı sayıya eşit
// olup olmadığını bulan program.

import java.util.Scanner;

public class j011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("___ number: ");
        int number = scanner.nextInt();
        int num = number;
        int answer = 0;

        while(number>0) {
            number /= 10;
            int temp = number%10;
            answer += temp*temp*temp;
        }
        if(answer == num) System.out.println("equal.");
        else System.out.println("not equal.");
    }
}
