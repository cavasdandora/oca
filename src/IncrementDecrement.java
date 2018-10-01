public class IncrementDecrement {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0

        //  -------------------------------------
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x:" + x);
        System.out.println("y:" + y);

        //  -------------------------------------
        //exemplu Liviu
        int i = 1;
        int a = 3 + ++i + i;
        System.out.println("a"+a);


        int j = 1;
        int b = 3 + j++ + j;
        System.out.println("b"+b);
    }
}
