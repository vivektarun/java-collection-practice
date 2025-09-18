package comparator.comparatorPractice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPractice3 {
    public static void main(String[] args) {
        List<Bus> buses = new ArrayList<>();

        buses.add(new Bus("suv", "petrol"));
        buses.add(new Bus("sedan", "diesel"));
        buses.add(new Bus("hatchback", "cng"));

        Collections.sort(buses, new Bus());

        buses.forEach((Bus busObj) -> System.out.println(busObj.busName + " " + busObj.busType));


    }
}
