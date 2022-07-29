/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 22.09.16
 * Time: 5:13
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void  main(String[] args){
        System.out.println(isPalindrome("Madam, I'm Adam!"));
        System.out.println(isPalindrome("abc"));

    }
    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        StringBuffer reverseText = new StringBuffer(text.replaceAll("[^a-zA-Z0-9]","").toLowerCase());
        return reverseText.toString().equals(reverseText.reverse().toString());
    }
}
