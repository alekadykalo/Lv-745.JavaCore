import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("--------FIRST TASK. Enter a sentence of five words. ----------");
        taskOne();
        System.out.println("--------SECOND TASK. Enter a sentence that contains the words between more than one space.----------");
        taskTwo();
        System.out.println("--------THIRD TASK. Implement a pattern for US currency. ----------");
        taskThree();
    }
    private static void taskOne(){
        System.out.print("Enter a sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of longest word: " + maxLength);
        if (words.length >= 2) {
            String secondWord = words[1];
            StringBuilder reversedSecondWord = new StringBuilder(secondWord);
            System.out.println("Second word reversed: " + reversedSecondWord.reverse().toString());
        }
    }
    private static void taskTwo(){
        System.out.print("Enter a sentence with multiple spaces: ");
        String sentence = scanner.nextLine();
        String newSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("Sentence without consecutive spaces: " + newSentence);
    }
    private static void taskThree(){
        System.out.print("Enter text containing US currency: ");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }
    }
}
