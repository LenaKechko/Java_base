public class Main {

    public static void main(String[] arg){
        System.out.println(charExpression(12));
        System.out.println(charExpression(29));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
    }
    public static char charExpression(int a) {
        return (char)('\\' + a);
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value))==1;
    }
}
