package Cap5;

public class Panda extends Bear {
    public static void sneeze() { // DOES NOT COMPILE
        System.out.println("Panda bear sneezes quietly");
    }
    public  void hibernate() { // DOES NOT COMPILE
        System.out.println("Panda bear is going to sleep");
    }

public static void main(String[] args){
        Panda.sneeze();
}}
