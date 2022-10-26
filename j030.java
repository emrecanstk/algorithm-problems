// 30: Boyu ve kilosu girilen kişiye vücut kitle indeksine göre geri bildirim veren program.

import java.util.Scanner;

public class j030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("metre: ");
        double metre = scanner.nextDouble();
        System.out.print("kilogram: ");
        double kilogram = scanner.nextDouble();
        System.out.println("kilogram/metre^2: "+kilogram/(metre*metre));

        if(kilogram/(metre*metre) < 18.5) System.out.println("underweight");
        if(kilogram/(metre*metre) >= 18.5 && kilogram/(metre*metre) < 25) System.out.println("normal");
        if(kilogram/(metre*metre) >= 25 && kilogram/(metre*metre) < 30) System.out.println("overweight");
        if(kilogram/(metre*metre) >= 30 && kilogram/(metre*metre) < 35) System.out.println("obese");
        if(kilogram/(metre*metre) >= 35) System.out.println("extremly obese");

    }
}
