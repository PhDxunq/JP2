package Lesson2.Bai9;

import java.util.*;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

