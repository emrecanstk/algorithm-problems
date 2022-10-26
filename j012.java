// 12: Klavyeden girilen 20 sayıdan çift olanların toplamının tek olanların
// toplamına oranını bulan program.

import java.util.Scanner;

public class j012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum1=0, sum2=0;

        for(int i=0; i<20; i++) {
            System.out.print("number"+(i+1)+": ");
            float num = scanner.nextFloat();
            if(num%2==1) sum1+=num;
            if(num%2==0) sum2+=num;
        }

        System.out.println("answer: "+(sum2/sum1));
    }
}
