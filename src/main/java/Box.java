

public class Box <T> {

    private T t;

    public Box(T t) {
        this.t = t;
    }


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void annouceSelf() {
        System.out.println("I am a box!");
    }
}
