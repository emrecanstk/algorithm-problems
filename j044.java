// 44: 1 ile 25 arasındaki tam sayıların karelerinin toplamını bulan program.

public class j044 {
    public static void main(String[] args) {
        long answer=0;
        for(int i=1;i<25;i++) {
            answer += i*i;
        }

        System.out.println(answer);
    }
}
