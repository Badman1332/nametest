
class NameRepository {

    private static String[] names = {};

    public static int getSize() {
        int length = names.length;
        return length;
    }

    public void setNames(String[] names) {
        NameRepository.names = names.clone();
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        return names.clone();
    }
}
