// 31: Yarıçapı girilen dairenin alanını ve çevresini hesaplayan program.

import java.util.Scanner;

public class j031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("r: ");
        double r = scanner.nextDouble();

        System.out.println("area: "+(r*r*3.14));
        System.out.println("perimeter: "+(2*3.14*r));
    }
}
