// 58: x + x^2 / 2! + x^3 / 3! + ... + x^n / n! işlemini girilen x ve n sayılarına göre hesaplayan program.

import java.util.Scanner;

public class j058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();
        int sum=0;

        for(int i=1; i<=n; i++) {
            sum+= Math.pow(x,i) / fact(i);
        }
    }
    static int fact(int n) {
        int ans=1;
        for(;n>1;n--) ans*=n;
        return ans;
    }
}
