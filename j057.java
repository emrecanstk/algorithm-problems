// 57: e^x taylor seri açılımını girilen x ve n değerlerine göre sonuç hesaplayan program.

import java.util.Scanner;

public class j057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();
        int sum=0;

        for(int i=0; i<n; i++) {
            sum+= Math.pow(x,i) / fact(i);
        }

        System.out.println(sum);
    }
    static int fact(int n) {
        int ans=1;
        for(;n>1;n--) ans*=n;
        return ans;
    }
}
