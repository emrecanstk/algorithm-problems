// 26: 1'den 63'e kadar olan sayılar arasından istenilen sayıyı maksimüm 6 hamlede bulan program.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class j026 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        for(int i=0;i<63;i++) {
            nums.add(i,i+1);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("number (1-63): ");
        int number = scanner.nextInt();
        int size = nums.size();

        int min = 0;
        int max = size;
        int counter=0;

        while(true) {
            counter++;
            if(number == nums.get((max+min)/2)) {
                break;
            }
            else if(number < nums.get((max+min)/2)) {
                max = (max+min)/2;
            }
            else if(number > nums.get((max+min)/2)) {
                min = (max+min)/2;
            }
            System.out.println("max: "+max+"   min: "+min);
        }

        System.out.println("number of moves: "+counter);

    }

}
