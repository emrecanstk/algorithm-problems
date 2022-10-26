// 3: Kullanıcının girdiği iki sayının karelerinin toplamını veren program.

import java.util.Scanner;

public class j003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number1: ");
        int a = scanner.nextInt();
        System.out.print("number2: ");
        int b = scanner.nextInt();

        System.out.println("answer: "+ (a+b));
    }
}
