// 28: İkilik olarak girilen sayıyı onluk sayıya çeviren program.

import java.util.Scanner;

public class j028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        int count=0;
        double answer=0;

        while(number>0) {
            int temp = number%10;
            if(temp==1) answer += Math.pow(2,count);
            number/=10;
            count++;
        }

        System.out.println(answer);
    }
}
