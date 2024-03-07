package opgave01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98 ));
        printHashSet(mySet);
        // This will not be added because it is already contained in the set
        mySet.add(23);
        System.out.println();
        printHashSet(mySet);
        System.out.println();
        mySet.remove(67);
        printHashSet(mySet);
        System.out.println("Does mySet contain 23: " +  mySet.contains(23));
        System.out.println("Number of elements in mySet: " + mySet.size());
    }
    private static void printHashSet(Set<Integer> mySet) {
        for (Integer i : mySet) {
            System.out.println(i);
        }
    }
}
