// 19: Klavyeden girilen sayının negatif, pozitif veya 0 olduğunu bulan program.

import java.util.Scanner;

public class j019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        if(number>0) System.out.println("positive");
        else if(number==0) System.out.println("notr");
        else System.out.println("negative");
    }
}
