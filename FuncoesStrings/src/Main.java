public class Main {
    public static void main(String[] args) {

        String stringOriginal = "abcde FGHIJ ABC abc DEFG  ";

        String s01 = stringOriginal.toLowerCase();
        String s02 = stringOriginal.toUpperCase();
        String s03 = stringOriginal.trim();
        String s04 = stringOriginal.substring(2);
        String s05 = stringOriginal.substring(2, 9);
        String s06 = stringOriginal.replace('a', 'z');
        String s07 = stringOriginal.replace("abc", "xy");
        int i = stringOriginal.indexOf("bc");
        int j = stringOriginal.lastIndexOf("bc");
        String[] vectString = "potato apple lemon".split(" ");

        System.out.println("Original: -" + stringOriginal + "-");
        System.out.println("toLower: -" + s01 + "-");
        System.out.println("toUpper: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace(a, z): -" + s06 + "-");
        System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
        System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
        System.out.println("indexOf(\"bc\"): " + i );
        System.out.println("lastIndexOf(\"bc\"): " + j);
        System.out.println(".split(\" \"): " + vectString[0]);

    }
}