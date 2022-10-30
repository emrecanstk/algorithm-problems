// 43: Girilen iki sayı için OBEB ve OKEK bulan program.

import java.util.Scanner;

public class j043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = scanner.nextInt();
        System.out.print("num2: ");
        int num2 = scanner.nextInt();
        int obeb=0;

        for(int i=1;i<num1;i++) {
            if(num1%i==0 && num2%i==0) obeb = i;
        }

        System.out.println("obeb: "+obeb);

        for(int i=1;i<=10;i++) {
            for(int j=1;j<=10;j++) {
                if(num1*i == num2*j) {
                    System.out.println("okek: "+num1*i);
                    return;
                }
            }
        }




    }
}
