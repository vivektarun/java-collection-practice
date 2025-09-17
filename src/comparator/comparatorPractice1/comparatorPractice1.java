package comparator.comparatorPractice1;

import java.util.Arrays;

public class comparatorPractice1 {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];

        carArray[0] = new Car("suv", "petrol");
        carArray[1] = new Car("sedan", "deisel");
        carArray[2] = new Car("hatchback", "cng");

        //comparison on the basis of type
        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj2.carType.compareTo(obj1.carType));

        for(Car car: carArray) {
            System.out.println(car.carName + " " + car.carType);
        }

        //comparison on the basis of name.
        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj1.carName.compareTo((obj2.carName)));

    }
}
