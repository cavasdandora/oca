package Cap3;

public class Immutability {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2"); //12
        s2.concat("3"); //123
        System.out.println(s2); //12

        //------------------------------------------------------
    }
}