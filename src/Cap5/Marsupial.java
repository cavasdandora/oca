package Cap5;

public class Marsupial {
    public final boolean isBiped(){
        return false;
    }
    public void getMarsupialDescription(){
        System.out.println("Marsupial walk on 2 legs: "+isBiped());
    }

}
