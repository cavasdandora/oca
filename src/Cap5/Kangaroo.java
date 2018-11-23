package Cap5;

public class Kangaroo extends Marsupial {

//    public boolean isBiped(){
//        return true;
//    }
    public void getKangarooDescription(){
        System.out.println("Marsupial hops on 2 legs: "+isBiped());
    }
    public static void main(String[] args){
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription(); // is false
        joey.getKangarooDescription(); // is true
    }
}
