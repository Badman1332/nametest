package org.company;

class NameRepository {

    private static String[] names = new String[]{};

    public static boolean remove(final String fullName) {
        int index = indexOf(fullName);
        if (index == -1) {
            return false;
        }
        String[] newNames = new String[names.length - 1];
        System.arraycopy(names, 0, newNames, 0, index);
        System.arraycopy(names, index + 1, newNames, index, names.length - index - 1);
        names = newNames;
        return true;
    }

    private static int indexOf(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}



