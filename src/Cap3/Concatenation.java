package Cap3;

public class Concatenation {
    public static void main(String[] args){
        System.out.println(1 + 2);
        System.out.println("a" + "b");
        System.out.println("a" + "b" + 3);
        System.out.println(1 + 2 + "c");

        //---------------------------------------

        int three = 3;
        String four = "4";
        //     System.out.println(1 + 2 + 3 + "4"); //64
        System.out.println(1 + 2 + three + four);

        //-------------------------------------

        String s = "1";
        s += "2"; //s=s+"2"-> 12
        s += 3; // s=s+3 -> 123
        System.out.println(s);



    }
}
