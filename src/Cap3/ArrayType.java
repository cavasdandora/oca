package Cap3;

public class ArrayType {
    public static void main(String args[]) {

        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;

        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

        System.out.println(java.util.Arrays.toString(bugs));


        // -------------------------------------- Casting arrays

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againString =  (String[]) objects;
    //    againString[0] = new StringBuilder(); // DOES NOT COMPILE
    //    objects[0] = new StringBuilder(); // careful!

        // --------------------------------------

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        // --------------------------------------

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.print(" " +numbers[i]);
        }
    }
}