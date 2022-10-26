// 7: Çarpma işlemini toplama kullanarak bulan program.

import java.util.Scanner;

public class j007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number1: ");
        int n1 = scanner.nextInt();
        System.out.print("number2: ");
        int n2 = scanner.nextInt();

        int answer = 0;
        for(;n2>0;n2--) {
            answer+=n1;
        }

        System.out.println("answer: "+answer);
    }
}
