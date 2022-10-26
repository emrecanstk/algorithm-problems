// 18: Fibonacci serisinin ilk 10 terimini ekrana basan program

import java.util.ArrayList;
import java.util.List;

public class j018 {
    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0, 1);
        fibonacci.add(1, 1);

        for(int i=2;i<10;i++) {
            fibonacci.add(i,fibonacci.get(i-1) + fibonacci.get(i-2));
        }
        for(int i=0;i<10;i++) {
            System.out.println(fibonacci.get(i));
        }

    }
}
