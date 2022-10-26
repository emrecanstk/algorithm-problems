// 5: Doğum tarihi girilen kişinin yaşını hesaplayan program

import java.util.Scanner;

public class j005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("birth year: ");
        int bYear = scanner.nextInt();
        System.out.println("your age: "+(2022-bYear));

    }
}
