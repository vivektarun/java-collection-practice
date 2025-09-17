package comparator.comparatorPractice3;

import java.util.Comparator;

public class Bus implements Comparator<Bus> {
    //Not good because it violates the single responsibility principle
    public String busName;
    public String busType;

    public Bus() {}

    public Bus(String busName, String busType) {
        this.busName = busName;
        this.busType = busType;
    }

    @Override
    public int compare(Bus b1, Bus b2) {
        return b1.busName.compareTo(b2.busName);
    }
}
