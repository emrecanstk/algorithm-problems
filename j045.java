// 45: ax^2 + bx + c tipindeki bir denklemin köklerini bulan program.

import java.util.Scanner;

public class j045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        double dsc = b*b - 4*a*c;

        if(dsc < 0) System.out.println("There is no real root.");
        double root1 = (b*-1 + Math.sqrt(dsc)/2*a);
        double root2 = (b*-1 - Math.sqrt(dsc)/2*a);
        if(dsc == 0) System.out.println("root1 = root2 = "+root1);
        if(dsc > 0) {
            System.out.println("root1 = "+root1);
            System.out.println("root2 = "+root2);
        }


    }
}
