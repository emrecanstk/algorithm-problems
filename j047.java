// 47: 10-100 arasındaki asal sayıları gösteren program.

public class j047 {
    public static void main(String[] args) {
        for(int i=10;i<100;i++) {
            boolean isTrue=true;
            for(int x=2;x<i;x++) {
                if(i%x==0) isTrue=false;
            }
            if(isTrue) System.out.println(i);
        }
    }
}
