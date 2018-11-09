package Cap4.my.school;

public class Classroom {
    private int roomNumber; // private visible only in sameclass
    protected String teacherName; // protected in package and subclass
    static int globalKey = 54321;
    public int floor = 3;

     public Classroom(int r, String t){
        roomNumber=r;
        teacherName=t;
    }

}
