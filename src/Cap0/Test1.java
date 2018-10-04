package Cap0;

public class Test1 {
 public static void main(String[] args) {
            int x = 5, j = 0;
            OUTER: for(int i=0; i<3; )
            INNER: do {
                 i++; x++; //i=0 ; x=5 ; i=1, x=6 ; i=2, x=7; i=3
                 if(x > 10) break INNER; //5>10 F
                 x += 4;
                 j++;
                 } while(j <= 2);
             System.out.println(x);
             } }

