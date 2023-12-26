package p1.anonymouse;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        // -------------- form 1 ---------------------
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        // -------------- form 2 ---------------------
        Comparator<String> comparator = (String o1, String o2) -> { return o1.compareTo(o2); };
        // -------------- form 3 ---------------------
        Comparator<String> comparator1 = Comparator.naturalOrder();

        System.out.println(getUnicodeOfChar('H'));
        System.out.println(getUnicodeOfChar('W'));

        int comparison = stringComparator.compare("Hello", "World");

        int comparison2 = comparator.compare("Hello", "World");

        System.out.println(comparison2);
    }

    private static String getUnicodeCharacterOfChar(char ch) {
        return String.format("\\u%04x", (int) ch);
    }

    private static int getUnicodeOfChar(char ch) {
        return (int) ch;
    }
}
