package Cap4;

public class Rope2 {
 public static void swing() {
         System.out.print("swing ");
         }
 public void climb() {
     System.out.println("climb ");
 }
 public static void play() {
         swing();
        // climb();
         }
 public static void main(String[] args) {
         Rope2 rope = new Rope2();
         rope.play();
         Rope2 rope2 = new Rope2();
         rope2.play();
         }
 }