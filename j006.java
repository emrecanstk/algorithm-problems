// 6: Girilen sayının faktöriyelini bulan program.

import java.util.Scanner;

public class j006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        int answer = 1;
        for(;number>0;number--) {
            answer *= number;
        }

        System.out.println("answer: "+answer);
    }
}
