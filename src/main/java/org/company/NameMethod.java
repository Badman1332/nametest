package org.company;

import java.util.Arrays;

class Namerepository {

    private static String[] names = {};

    // ... existing methods ...

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equals(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        String[] newNames = Arrays.copyOf(names, names.length + 1);
        newNames[names.length] = fullName;
        names = newNames;
        return true;
    }
}
