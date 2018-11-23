package Cap5;

public abstract class MyAbstractProcess {
    public void process(){
        stepBefore();
        action();
        stepAfter();
    }

    public void stepBefore(){

    }

    public abstract void action();

    public void stepAfter(){

    }
}
