/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 29.09.16
 * Time: 9:08
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"money", "date"});
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(10);
        TextAnalyzer[] analyzers = new TextAnalyzer[]{spamAnalyzer, negativeTextAnalyzer, tooLongTextAnalyzer};
        System.out.println(checkLabels(analyzers, "Это весело"));
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        }
        return Label.OK;
    }
}
