package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePractice {
    public static void main(String[] args) {
        List<Bus> buses = new ArrayList<>();

        buses.add(new Bus("adfa", "aga"));
        buses.add(new Bus("qerq", "aqeb"));
        buses.add(new Bus("jopp", "zxcv"));


        //here we can directly call sort.
        Collections.sort(buses);

        //print all the busses.
        buses.forEach(System.out::println);
    }
}
