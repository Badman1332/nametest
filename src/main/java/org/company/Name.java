package org.company;

import java.util.Arrays;

public class Name {

    public static void main(String[] args) {
        String[] names = {"erik svensson", "anna maria ", "david davidsson"};
        String[] formattedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String[] nameParts = names[i].split(" ");
            formattedNames[i] = "[" + nameParts[0] + "]" + " " + nameParts[1];
        }

        System.out.println(Arrays.toString(formattedNames));
    }
}
