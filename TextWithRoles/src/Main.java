/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 23.09.16
 * Time: 6:48
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(printTextPerRole(new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич" },
                new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                        "Аммос Федорович: Как ревизор?",
                        "Артемий Филиппович: Как ревизор?",
                        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                        "Аммос Федорович: Вот те на!",
                        "Артемий Филиппович: Вот не было заботы, так подай!",
                        "Лука Лукич: Господи боже! еще и с секретным предписаньем!" }));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i] + ":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    result.append(j + 1 + ") " + textLines[j].replaceFirst(roles[i] + ": ", "") + "\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
