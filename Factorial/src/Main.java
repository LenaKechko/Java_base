import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 22.09.16
 * Time: 5:48
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        System.out.println(factorial(4));
    }
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        if (value == 1){
            return BigInteger.valueOf(value);
        }
        return BigInteger.valueOf(value).multiply(factorial(value-1));
    }
}
