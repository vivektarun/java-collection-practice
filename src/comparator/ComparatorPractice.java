package comparator;

import java.util.Arrays;

public class ComparatorPractice {
    //Here we are practicing using lambda functions
    //So we need not write the implementation
    //NOTE: functional interface just a shorthand of write any implementation of functional interface method.

    //Sorting algo uses this compare method of comparator
    //to compare 2 variable and decide whether to swap the variables or not.

    //Mostly in algorithm, if this method return 1, it swaps the value.
    public static void main(String[] args) {
        Integer a[] = {6,1,3,5,8};

        //ascending order.
        //used lambda function as comparator.
        Arrays.sort(a, (Integer val1, Integer val2) -> val1 - val2); // 6-1  value is 5 -> it is positive, so value will be swapped

        for(int val : a) {
            System.out.println(val);
        }
        //descending order
        Arrays.sort(a, (Integer v1, Integer v2) -> v2 - v1);

        for(int val : a) {
            System.out.println(val);
        }





    }
}
