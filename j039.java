// 39: Sayı bulmaca oyunu oynatan program.

import java.util.Random;
import java.util.Scanner;

public class j039 {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(100);

        while(true) {
            System.out.print("prediction: ");
            int num = scanner.nextInt();
            count++;
            if(num<number) System.out.println("Enter a larger number.");
            else if(num>number) System.out.println("Enter a smaller number.");
            else break;
        }
        System.out.println("Congrats! Moves: "+count);
    }
}
