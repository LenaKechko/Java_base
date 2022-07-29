/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 29.09.16
 * Time: 4:28
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        byte[] m= new byte[]{65, 66, 67, 68, 69};
        AsciiCharSequence acs = new AsciiCharSequence(m);
        System.out.println(acs.length());
        System.out.println(acs.charAt(3));
        System.out.println(acs.subSequence(1,5));
        System.out.println(acs.toString());
    }
}
