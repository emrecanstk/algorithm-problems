// 55: Girilen 10 sayının ortalamasıyla bu sayılardan en büyük ve en küçüğünün ortalamasının farkını veren program.

import java.util.Scanner;

public class j055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int min=9999,max=-9999;
        for(int i=0;i<10;i++) {
            System.out.print("number"+(i+1)+": ");
            int num = scanner.nextInt();
            sum += num;
            if(num<min) min = num;
            if(num>max) max = num;
        }
        System.out.println(sum/10 - (max+min)/2);

    }
}
