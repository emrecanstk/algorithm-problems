// 59: 1-1 + 3+1 + 5-1 + 7+1 + 9-1 ... serisini girilen n terim için hesaplayan program.

import java.util.Scanner;

public class j059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int ans=0;
        int a=1,b=-1;

        for(;a<=n;a+=2) {
            ans+=a+b;
            b*=-1;
        }
        System.out.println(ans);
    }
}
