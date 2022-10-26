// 4: 1'den 100'e kadar olan sayıların küplerinin toplamını veren program.

public class j004 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<100; i++) {
            sum += i*i*i;
        }

        System.out.println(sum);
    }
}
