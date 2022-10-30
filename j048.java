// 48: Girilen sayının smith sayısı olup olmadığını bulan program.

import java.util.Scanner;

public class j048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        int number2=number,numberx=number;
        int sum1=0,sum2=0;
        int i=2;
        int mult=1;

        while(number2>0) {  // girilen sayının basamaklarının toplamı
            sum1+=number2%10;
            number2/=10;
        }

        while(true) {
            if(number%i == 0 && isPrime(i)) { // sayının tam bölmesi, aynı zamanda asal olması durumu
                number/=i;
                int temp = i;

                while(temp>0) {               // asal tam bölenin basamakları toplamı
                    sum2+=temp%10;
                    temp/=10;
                }

                mult*=i;
                System.out.println(i);
                i=1;
            }
            i++;
            if(mult == numberx) break;       // asal tam bölenlerin çarpımı sayıya eşit olduysa durdur
        }

        if(sum1 == sum2) System.out.println("true");
        else System.out.println("false");

    }

    static boolean isPrime(int num) {
        for(int i=2;i<num;i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
