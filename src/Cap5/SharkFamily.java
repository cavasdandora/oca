package Cap5;

public interface SharkFamily extends HasFins {
    public default int getNumberOfFins(){
        return 5;
    }
    public double getLongestFinLength();
    public boolean doFinsHaveScales() ;
}
