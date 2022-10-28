// 41: İç açıları verilen üçgenin hangi tip üçgen olduğunu bulan program

import java.util.Scanner;

public class j041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        if(a+b+c != 180) System.out.println("not triangle.");
        else {
            if(a==90 || b==90 || c==90) {
                if(a==b || b==c || a==c) System.out.print("twin edge");
                System.out.print(" right");
            }
            else if(a==b && a==c) System.out.println("equilateral");
            else if((a==b && a!=c) || (a==c && a!=c)) System.out.println("twin edge");
            else System.out.println("scalene");
            System.out.print(" triangle.");
        }
    }
}
