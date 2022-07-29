import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 22.09.16
 * Time: 6:01
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 3, 5}, new int[]{1, 3, 6, 7})));
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int k = 0, i_index = 0, j_index = 0;
        while (k <= a1.length + a2.length) {
            for (int i = i_index; i < a1.length; i++) {
                if (a1[i] < a2[j_index]) {
                    result[k] = a1[i];
                    i_index = i + 1;
                    k++;
                } else {
                    i_index = i;
                    break;
                }
            }
            if (i_index == a1.length) {
                for (int j = j_index; j < a2.length; j++) {
                    result[k] = a2[j];
                    k++;
                }
                break;
            } else {
                for (int j = j_index; j < a2.length; j++) {
                    if (a2[j] <= a1[i_index]) {
                        result[k] = a2[j];
                        j_index = j + 1;
                        k++;
                    } else {
                        j_index = j;
                        break;
                    }
                }
            }
            if (j_index == a2.length) {
                for (int i = i_index; i < a1.length; i++) {
                    result[k] = a1[i];
                    k++;
                }
                break;
            }
        }
        return result;
    }
}
