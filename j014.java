// 14: Klavyeden girilen 25 sayı içerisinden
// negatif olanların toplamını,
// çift sayıların çarpımını,
// 7'ye eşit olanların adedini bulan programı yazınız.

import java.util.Scanner;

public class j014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans1=0, ans2=1, ans3=0;
        for(int i=0;i<25;i++) {
            System.out.print("number"+(i+1)+": ");
            int num = scanner.nextInt();
            if(num<0) ans1+=num;
            else if(num%2==0) ans2*=num;
            else if(num==7) ans3++;
        }
        System.out.println("sum of negative numbers: "+ans1);
        System.out.println("multiplication of even numbers: "+ans2);
        System.out.println("number of those equal to 7: "+ans3);
    }
}
