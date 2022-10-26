// 20: Girilen sayının mükemmel sayı olup olmadığını bulan program.
// Mükemmel sayı: Kendisi hariç pozitif tam bölenlerinin toplamının kendisine eşit olan sayı.

import java.util.Scanner;

public class j020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        int sum=0;

        for(int i=1;i<number;i++) {
            if(number%i==0) sum+=i;
        }

        if(sum==number) System.out.println("true");
        else System.out.println("false");

    }
}
