package Cap5;

public interface SharkFamily extends HasFins {
    default int getNumberOfFins(){
        return 5;
    }
    double getLongestFinLength();
    boolean doFinsHaveScales() ;
}
