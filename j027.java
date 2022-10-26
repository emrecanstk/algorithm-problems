// 27: Girilen onluk sayıyı ikilik sayıya çeviren program.

import java.util.Scanner;

public class j027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();

        int answer=0;
        int count=0;
        while(number>0) {
            int temp = number%2;
            number/=2;
            answer += temp*(Math.pow(10,count));
            count++;
        }

        System.out.println(answer);
    }
}
