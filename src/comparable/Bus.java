package comparable;

public class Bus implements Comparable<Bus>{
    public String busName;
    public String busType;

    public Bus(String busName, String busType) {
        this.busName = busName;
        this.busType = busType;
    }

    @Override
    public int compareTo(Bus other) {
        return this.busName.compareTo(other.busName);
    }
}
