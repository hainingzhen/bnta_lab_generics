import java.util.List;

public class Main {

    public static void main(String[] args) {

        // -- BOX GENERCIS TEST

        Box unboundedBox = new Box(1);
        unboundedBox.annouceSelf();
        System.out.println(unboundedBox.getT());
        unboundedBox.setT("String");
        System.out.println(unboundedBox.getT());


        Box<Integer> boundedBox = new Box(2);
        boundedBox.annouceSelf();
        System.out.println(boundedBox.getT());
//        boundedBox.setT("String");




        // -- PAIR GENERICS TEST

        Pair<String, Integer> stringIntegerPair = new Pair<>("String", 10);
        System.out.println(stringIntegerPair.getK());
        System.out.println(stringIntegerPair.getV());

        Pair<Double, Integer> doubleIntegerPair = new Pair<>(10.10, 10);
        System.out.println(doubleIntegerPair.getK());
        System.out.println(doubleIntegerPair.getV());
//        doubleIntegerPair.setK("String");




        // -- WILDCARDS

        WildcardsExample wildcardsExample = new WildcardsExample();

        List<Grampa> grampas = List.of(
                new Grampa("Chris"),
                new Grampa("Theodore"),
                new Grampa("Rudolph")
        );

        List<Father> fathers = List.of(
                new Father("Chris"),
                new Father("Theodore"),
                new Father("Rudolph")
        );

        List<Child> children = List.of(
                new Child("Chris"),
                new Child("Theodore"),
                new Child("Rudolph")
        );

        wildcardsExample.printNames_grampasAndFatherOnly(grampas);
        wildcardsExample.printNames_grampasAndFatherOnly(fathers);
//        wildcardsExample.printNames_grampasAndFatherOnly(children);

//        wildcardsExample.printNames_fathersAndChildrenOnly(grampas);
        wildcardsExample.printNames_fathersAndChildrenOnly(fathers);
        wildcardsExample.printNames_fathersAndChildrenOnly(children);

        wildcardsExample.printNames_allFamily(grampas);
        wildcardsExample.printNames_allFamily(fathers);
        wildcardsExample.printNames_allFamily(children);
    }
}
