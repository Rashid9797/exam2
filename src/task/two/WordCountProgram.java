package task.two;
import java.util.*;

public class WordCountProgram {
    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>();
        sentences.add("This is the first sentence.");
        sentences.add("And this is the second sentence.");
        sentences.add("Finally, the third sentence.");

        for (String sentence : sentences) {
            int wordCount = getWordCount(sentence);
            System.out.println("Word count for sentence \"" + sentence + "\": " + wordCount);
        }
    }

    public static int getWordCount(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        return words.size();
    }
}
