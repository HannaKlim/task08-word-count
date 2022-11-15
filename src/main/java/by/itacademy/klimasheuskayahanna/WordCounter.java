package by.itacademy.klimasheuskayahanna;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public int countingWordsWithVowels(String str) {
        int count = 0;
        String[] wordArray = str.split("[\\s,.:!?]+");
        Pattern pattern = Pattern.compile("^[аоэиуыеёюя].*[аоэиуыеёюя]$");
        for (String word : wordArray) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}
