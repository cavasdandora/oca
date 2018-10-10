package Cap0;

public class Test {
    public static void main(String[] args) {
//        String s1 = "Java";
//        String s2 = "Java";
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append("Ja").append("va"); //sb1: Java
//        System.out.println(s1 == s2); //true
//        System.out.println(s1.equals(s2)); //true
//        System.out.println(sb1.toString() == s1); //false
//        System.out.println(sb1.toString().equals(s1)); // true

        boolean keepGoing = true;
        int count = 0;
        int x = 3;

        while (count++ < 3) { // 0<3, 1<3, 2<3
            int y = (1 + 2 * count) % 3; // count 1 y: 1 ; count 2 y : 2 ; count 3 y : 1
            switch (y) { // y: 0 ; y: 2 ; y:
                default:
                case 0:
                    x -= 1; //x: 2
                    break;
                case 1:
                    x += 5; //x:
            }
        }
        System.out.println(x);   // x: 2
    }

}