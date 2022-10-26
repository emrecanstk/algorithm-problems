// 22: Herhangi bir sayının herhangi bir dereceden kuvvetini bulan program.

import java.util.Scanner;

public class j022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = scanner.nextInt();
        System.out.print("num2: ");
        int num2 = scanner.nextInt();
        int answer=1;

        for(int i=0;i<num2;i++) {
            answer*=num1;
        }

        System.out.println("answer: "+answer);
    }
}
