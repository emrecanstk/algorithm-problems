// 16: Girilen sayının 5'in kuvveti olup olmadığını bulan program

import java.util.Scanner;

public class j016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        float number = scanner.nextInt();
        boolean isEqual = false;

        for(int i=0;Math.pow(5,i)<=number;i++) {
            if(Math.pow(5,i) == number) isEqual = true;
        }

        System.out.println(isEqual);
    }
}
