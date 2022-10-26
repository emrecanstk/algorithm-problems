// 25: Girilen a ve b sayıları 50'den büyük olduğunda c=a+b işlemi yapan, değilse uygun değildir yazan program.

import java.util.Scanner;

public class j025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        if(a>50 && b>50) {
            System.out.println(a+" + "+b+" = "+(a+b));
        }
        else System.out.println("uygun değil.");
    }
}
