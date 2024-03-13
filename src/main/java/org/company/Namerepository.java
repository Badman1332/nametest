package org.company;
public class NameRepository {

    private static String[] names = {};

    public static int getSize() {
        int length = names.length;
        return length;
    }

    public static void setNames(String[] names) {
        this.names = names.clone();
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        return names.clone();
    }
}
