package Cap3;

public class StringMethods {
    public static void main(String[] args){
        //---- length() -- no of characters
        String string = "animals";
        System.out.println(string.length());   //7

        //---------- charAt() -- position of character
        String string2 = "animals";
        System.out.println(string2.charAt(0)); // a
        System.out.println(string2.charAt(6)); // s
       // System.out.println(string2.charAt(7)); // throws exception

        //-------------indexOf() -- finds first INDEX of charact
        String string3 = "animals";
        System.out.println(string3.indexOf('a')); // 0
        System.out.println(string3.indexOf("al")); // 4
        System.out.println(string3.indexOf('a', 4)); // 4
        System.out.println(string3.indexOf("al", 5)); // -1 does not throw exept

        //--------------- substring() -- returns part of the string
        String string4 = "animals";
        System.out.println(string4.substring(3)); // mals
        System.out.println(string4.substring(string.indexOf('m'))); // mals
        System.out.println(string4.substring(3, 4)); // m
        System.out.println(string4.substring(3, 7)); // mals

        String string5 = "animals";
        System.out.println(string5.substring(3,3)); // empty
      //  System.out.println(string5.substring(3,3)); // exep
      //  System.out.println(string5.substring(3,8)); // exep

        //toLowerCase() toUpperCase()
        String string6 = "animals";
        System.out.println(string6.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        //------ equals() equalsIgnoreCase()
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        //------ startsWith() endsWith()
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        //--------contains()
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false


        //-------------- replace()
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        //--------- trim() --- removes whitespace
        System.out.println("abc".trim()); // abc
        System.out.println("\t a b c\n".trim()); // a b c

        //---- method chaining

        String start = "AniMal         ";
        String trimmed = start.trim();
        String lowercase = trimmed.toLowerCase();
        String result = lowercase.replace('a','A');
        System.out.println("Result is : " + result);

        String result2= start.trim().toLowerCase().replace('a','A');
        System.out.println("Result is : " + result2);

        // example

        String a = "abc";
        String b = a.toUpperCase();   //ABC
        b = b.replace("B", "2").replace('C', '3');  //A2C -> A23
        System.out.println("a=" + a); //abc
        System.out.println("b=" + b); // A23



    }
}
