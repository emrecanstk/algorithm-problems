// 40: 10 ile 200 arasındaki sayılardan 3 katının 2 fazlası 5'e tam bölünebilen sayıları gösteren program.

public class j040 {
    public static void main(String[] args) {
        for(int i=10;i<200;i++) {
            if(((3*i)+2)%5==0) System.out.println(i);
        }
    }
}
