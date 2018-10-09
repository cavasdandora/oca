package Cap3;

public class Equal {
    public static void main(String[] args) {
//        String s = "Hello";
//        String t = new String(s);
//        if ("Hello".equals(s)) System.out.println("one"); //one
//        if (t == s) System.out.println("two"); // false
//        if (t.equals(s)) System.out.println("three"); // three
//        if ("Hello" == s) System.out.println("four"); //  four
//        if ("Hello" == t) System.out.println("five"); // false


//
//         String s1 = "java";
//        StringBuilder s2 = new StringBuilder("java");
//         if (s1 == s2)
//             System.out.print("1");
//         if (s1.equals(s2))
//             System.out.print("2");
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");  // sb1: Java
        System.out.println(s1 == s2);  //true
        System.out.println(s1.equals(s2)); // true
        System.out.println(sb1.toString() == s1); // false
        System.out.println(sb1.toString().equals(s1)); // true

    }
}

