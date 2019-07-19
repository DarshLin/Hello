public class Hello {
    public static void main(String[] args) {
        System.out.printf("Hello World, this is a test! There should be other functions too!");

        System.out.println(outputAddition(10, 20));
        System.out.println(outputSubtraction(20, 10));
        System.out.println(outputMultiply(10, 20));
        System.out.println(outputDivide(20, 10));
        System.out.println(concatenateStrings("Hello", "World"));
    }

    private static String concatenateStrings(String hello, String world) {
        return hello + " " + world;
    }

    private static double outputDivide(int i, int i1) {
        return i/i1;
    }

    private static int outputMultiply(int i, int i1) {
        return i * i1;
    }

    private static int outputSubtraction(int i, int i1) {
        return i - i1;
    }

    private static int outputAddition(int i, int i1) {
        return i + i1;
    }
}

