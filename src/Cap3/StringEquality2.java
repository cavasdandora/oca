package Cap3;

public class StringEquality2 {


    String name;

    public static void main(String[] args) {

//
//        StringEquality2 t1 = new StringEquality2();
//        StringEquality2 t2 = new StringEquality2();
//        StringEquality2 t3 = t1;
//        System.out.println(t1 == t1); // true
//        System.out.println(t1 == t2); // false
//        System.out.println(t1.equals(t2)); // false

         String s = "Hello";
         String t = new String(s);
         if ("Hello".equals(s)) System.out.println("one"); //one
         if (t == s) System.out.println("two"); //false
         if (t.equals(s)) System.out.println("three"); //three

         if ("Hello" == s) System.out.println("four"); // four??
         if ("Hello" == t) System.out.println("five"); // not true
    }
}

