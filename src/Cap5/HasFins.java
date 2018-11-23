package Cap5;

public interface HasFins {

    public default int getNumberOfFins(){
    return 10;
    }
    public default double getLongestFinLength(){
    return 2.5;
    }
    public default boolean doFinsHaveScales(){
    return true;
    }
}
