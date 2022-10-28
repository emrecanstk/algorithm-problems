// 42: Girilen sayının yaklaşık olarak karekökünü bulan program.

import java.text.DecimalFormat;
import java.util.Scanner;

public class j042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        float i=0.0001f;

        for(;i*i<=number;i+=0.0001) {}

        System.out.println(new DecimalFormat("#.###").format(i));
    }
}
