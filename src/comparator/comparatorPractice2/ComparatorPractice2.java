package comparator.comparatorPractice2;

import comparator.comparatorPractice1.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPractice2 {
    public static void main(String[] args) {
        //here using every collection features.

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suv", "petrol"));
        cars.add(new Car("sedan", "diesel"));
        cars.add(new Car("hatchback", "cng"));

        Collections.sort(cars, new CarNameComparator());

        cars.forEach((Car c1) -> System.out.println(c1.carName + " " + c1.carType));

    }
}
