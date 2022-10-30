// 49: İki dik kenarı girilen üçgenin hipotenüsünü hesaplayan program

import java.util.Scanner;

public class j049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.println(Math.sqrt(a*a+b*b));
    }
}
