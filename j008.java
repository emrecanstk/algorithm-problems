// 8: Bölme işlemini çıkarma kullanarak bulan program.

import java.util.Scanner;

public class j008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number1: ");
        int n1 = scanner.nextInt();
        System.out.print("number2: ");
        int n2 = scanner.nextInt();

        int answer = 0;
        while(n1>=n2) {
            n1 -= n2;
            answer++;
        }

        System.out.println("answer: "+answer);
    }


}
