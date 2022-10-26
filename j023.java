// 23: Girilen sayının "güçlü sayı" mı yoksa "güçsüz sayı" mı olduğunu bulan program.
// Güçlü sayı: basamaklarının faktöriyellerinin toplamı kendisine eşit olan sayı.

import java.util.Scanner;

public class j023 {
    public static int facSum(int num) {
        int ans=1;

        for(;num>0;num--) {
            ans*=num;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        int number2 = number;
        int sum=0;

        while(number>0) {
            number/=10;
            int temp = number%10;
            sum += facSum(temp);
        }
        if(number2 == sum) System.out.println("strong number.");
        else System.out.println("not strong number.");
    }
}
