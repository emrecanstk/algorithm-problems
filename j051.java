// 51: Yarıçapı girilen kürenin alanını ve hacmini hesaplayan program.

import java.util.Scanner;

public class j051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("r: ");
        int r = scanner.nextInt();
        System.out.println("area: "+4*3.14*r*r);
        System.out.println("volume: "+(4*3.14*r*r*r)/3);
    }
}
