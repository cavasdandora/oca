package Cap4;

public class Vararg {

    static void howMany(boolean b, boolean... b2) {
      //  return b2.length;
       System.out.println(b2.length);

    }

    public static void main(String[] args){
        howMany(true);


    }
}
