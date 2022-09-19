package stringmanipulation;

public class titleCase {
    public static void main(String[] args) {


        String str = "nripta";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String firstletter = String.valueOf(words[i].charAt(0)).toUpperCase();
            String othersletter = words[i].substring(1);
            System.out.println(firstletter + othersletter);
        }
    }
}