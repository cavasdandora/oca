package Cap3;

public class Test1 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);

        if ("Hello".equals(s)) System.out.println("one"); //one
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three"); //3
        if ("Hello" == s) System.out.println("four"); //4
        if ("Hello" == t) System.out.println("five");

        //--------------------------------------------Q4

         StringBuilder sb = new StringBuilder();
         sb.append("aaa").insert(1, "bb").insert(4, "ccc"); //abbaccca
         System.out.println(sb);

         //-------------------------------Q5
         String s1 = "java";
         StringBuilder s2 = new StringBuilder("java");
//         if (s1 == s2)
//            System.out.print("1");
         if (s1.equals(s2))
             System.out.print("2");

    }
}
