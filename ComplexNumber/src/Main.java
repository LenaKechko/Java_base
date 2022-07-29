/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 25.09.16
 * Time: 8:29
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
