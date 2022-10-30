// 52: Girilen sayının basamaklarındaki rakamlarından en büyüğünü bulan program.

import java.util.Scanner;

public class j052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        int max=0;

        while(number>0) {
            if(number%10 > max) max = number%10;
            number/=10;
        }

        System.out.println(max);
    }
}
