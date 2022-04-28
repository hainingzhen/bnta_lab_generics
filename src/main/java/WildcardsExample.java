import java.util.List;

public class WildcardsExample {

    public void printNames_fathersAndChildrenOnly(List<? extends Father> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void printNames_grampasAndFatherOnly(List<? super Father> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void printNames_allFamily(List<? extends Grampa> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
