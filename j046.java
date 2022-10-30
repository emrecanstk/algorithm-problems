// 46: 1-100 arasında kaç tane asal sayı vardır gösteren program.

public class j046 {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<100;i++) {
            boolean isTrue=true;
            for(int x=2;x<i;x++) {
                if(i%x==0) isTrue=false;
            }
            if(isTrue) count++;
        }

        System.out.println(count);
    }
}
