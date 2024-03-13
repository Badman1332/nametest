import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NameRepository {

    private static String[] names = {};

       public static String[] findByFirstName(final String firstName) {
        List<String> matches = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith(firstName + " ")) {
                matches.add(name);
            }
        }
        return matches.toArray(new String[0]);
    }

    public static String[] findByLastName(final String lastName) {
        List<String> matches = new ArrayList<>();
        for (String name : names) {
            int indexOfSpace = name.lastIndexOf(" ");
            if (indexOfSpace != -1 && name.substring(indexOfSpace + 1).equals(lastName)) {
                matches.add(name);
            }
        }
        return matches.toArray(new String[0]);
    }

    public static boolean update(final String original, final String updatedName) {
        int index = indexOf(original);
        if (index == -1 || indexOf(updatedName) != -1) {
            return false;
        }
        String[] newNames = Arrays.copyOf(names, names.length);
        newNames[index] = updatedName;
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

