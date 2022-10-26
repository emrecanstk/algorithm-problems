// 24: 1'den 500'e kadar olan tamsayıların toplamını bulan program.

public class j024 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<500;i++) {
            sum+=i;
        }

        System.out.println(sum);
    }
}
