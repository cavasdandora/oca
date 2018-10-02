package Cap3;

public class StringEquality {
    public static void main(String[] args){

        //---------------------String Equality
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a"); // three : a ; one : a
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        //---------------------String Equality
        String p = "Hello World";
        String o = "Hello World";
        System.out.println(p == o); //true

        String t = "Hello World";
        String h = " Hello World".trim();
        System.out.println(t);
        System.out.println(h);
        System.out.println(t == h); // false

        String f = "Hello World";
        String v = " Hello World".trim();
        System.out.println(f.equals(v)); // true

    }
}
