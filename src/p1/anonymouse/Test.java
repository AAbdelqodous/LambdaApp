package p1.anonymouse;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        // -------------- form 1 ---------------------
        Comparator<String> anonymousComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        // -------------- form 2 ---------------------
        Comparator<String> lambdaComparator =
//                (String o1, String o2) -> { return o1.compareTo(o2); };
                (o1, o2) -> o1.compareTo(o2);
        // -------------- form 3 ---------------------
        Comparator<String> naturalOrderComparator = Comparator.naturalOrder();

        System.out.println(getUnicodeOfChar('H'));
        System.out.println(getUnicodeOfChar('W'));

        int anonymousComparison = anonymousComparator.compare("Hello", "World");
        System.out.println(anonymousComparison);

        int lambdaComparison = lambdaComparator.compare("Hello", "World");
        System.out.println(lambdaComparison);

        int naturalOrderComparison = naturalOrderComparator.compare("Hello", "World");
        System.out.println(naturalOrderComparison);
    }

    private static String getUnicodeCharacterOfChar(char ch) {
        return String.format("\\u%04x", (int) ch);
    }

    private static int getUnicodeOfChar(char ch) {
        return (int) ch;
    }
}
