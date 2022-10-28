// 38: Girlen 50 sayıdan negatiflerin sayısı ile pozitiflerin sayısını bulan program.

import java.util.Scanner;

public class j038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0,count_=0;

        for(int i=1;i<51;i++) {
            System.out.print("number"+i+": ");
            int num = scanner.nextInt();
            if(num<0) count_++;
            else if(num>0) count++;
        }

        System.out.println("positive count: "+count);
        System.out.println("negative count: "+count_);
    }
}
