package Lesson2.Bai2;

public final class Algorithm {
    public static <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(max(8,9));
        System.out.println(max("a","b"));
    }
}
