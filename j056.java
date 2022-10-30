// 56: k sayısı tek ise 3 ile çarpılıp 1 ekleniyor çift ise 2 ile bölünüyor işlem k sayısı 1 olana kadar devam ediyor
// bu işlemin kaç adım sürdüğünü,işlem sırasında k sayısının aldığı max değeri k sayısının hangi sayıdan sonra
// hep çift olarak 1'e ulaştığını bulan program.

import java.util.Scanner;

public class j056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("k: ");
        int k = scanner.nextInt();
        int max=k,count=0,x=0;

        while(k!=1) {
            if(k%2==1) {
                k=k*3+1;
                x=0;
            }
            else {
                k/=2;
                x++;
            }
            if(k>max) max=k;
            count++;
        }

        for(int i=0;i<x;i++) k*=2;

        System.out.println("count: "+count);
        System.out.println("max: "+max);
        System.out.println("spes: "+k);
    }
}
