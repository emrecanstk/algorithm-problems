// 17: x ve y pozitif tam sayı olmak üzere,
// x sayısının çarpanlarının toplamı y'ye,
// y sayısının çarpanlarının toplamı da x'e eşitse bu sayılar dost sayıdır.
// Buna göre girilen iki sayının dost olup olmadığını bulan program.

import java.util.Scanner;

public class j017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        int sumx=0,sumy=0;
        for(int i=0; i<=x || i<=y; i++) {
            if(x%i==0) sumx+=i;
            if(y%i==0) sumy+=i;
        }

        if(sumx==y && sumy==x) System.out.println("friends numbers!!");
        else System.out.println("not friends numbers.");
    }
}
