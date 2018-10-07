package Cap3;

public class Employee {
    int age;
    String name;

    public Employee(int age){
        this.age=age;
    }
    public void employeNname(String newname){
        name=newname;
    }
    public void printEmployee(){
        System.out.println("Enployee name:" +name);
        System.out.println("Enployee age:" +age);


    }
}

