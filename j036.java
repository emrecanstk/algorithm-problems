// 36: 1 ile 500 arasındaki sayılardan tek sayıların toplamıyla çift sayıların toplamının farkı negatif mi değil mi bulan program.

public class j036 {
    public static void main(String[] args) {
        int sum1=0,sum2=0;
        for(int i=1;i<500;i++) {
            if(i%2==1) sum1+=i;
            else sum2+=i;
        }
        if(sum1-sum2 < 0) System.out.println("negative");
        else System.out.println("positive");
    }
}