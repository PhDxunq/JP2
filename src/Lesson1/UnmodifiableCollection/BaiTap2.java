package Lesson1.UnmodifiableCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BaiTap2 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        Collection<Integer> integerCollection = Collections.unmodifiableCollection(integerSet);
        try {
            integerCollection.add(5);
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}
