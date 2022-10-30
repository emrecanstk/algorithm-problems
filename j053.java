// 53: Girilen sayı 5-10 arasındaysa karesini alan, 5'ten küçükse faktöriyelini alan, 10'dan büyükse ikiye bölüp bir eksiğini alan program.

import java.util.Scanner;

public class j053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();

        if(number>=5 && number<=10) System.out.println(number*number);
        if(number>50) System.out.println((number/2)-1);
        if(number<5) {
            int ans=1;
            for(;number>0;number--) {
                ans*=number;
            }
            System.out.println(ans);
        }
    }
}
