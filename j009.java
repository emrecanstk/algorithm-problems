// 9: Girilen sayının istenen sayıya göre mod işlemini yaptıran program.

import java.util.Scanner;

public class j009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number1: ");
        int n1 = scanner.nextInt();
        System.out.print("number2: ");
        int n2 = scanner.nextInt();

        int answer = 0;
        while(n1>=n2) {
            n1 -= n2;
        }

        System.out.println("answer: "+n1);
    }
}
