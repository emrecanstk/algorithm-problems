// 21: 1'den 100'e kadar olan çift sayıların toplamında ilerlerken mükemmel sayıları ekrana yazdıran program.

public class j021 {
    public static void main(String[] args) {
        int sum2=0;

        for(int i=2;i<100;i+=2) {
            int sum= 0;
            sum2+=i;

            for(int x=1;x<sum2;x++) {
                if(sum2%x==0) sum+=x;
            }

            if(sum==sum2) System.out.println(sum2);
        }
    }
}
