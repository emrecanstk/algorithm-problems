// 10: Girilen sayının basamak sayısını bulan program.

import java.util.Scanner;

public class j010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        int answer = 0;

        if(number==0) System.out.println("answer: 1");
        else {
            while(number>0) {
                number /= 10;
                answer++;
            }

            System.out.println("answer: "+answer);
        }

    }
}
