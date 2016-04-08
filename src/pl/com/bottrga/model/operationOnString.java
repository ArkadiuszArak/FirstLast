package pl.com.bottrga.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by arkadiuszarak on 07/04/2016.
 */
public class operationOnString {

    public String splitMethod(String sentence) {

        String[] words = sentence.split("\\s+");
        //String[] words = sentence.split("[,;.\\s]+");

        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            List<Character> letters = new ArrayList<>();
            for (char letter : word.toCharArray()) {
                letters.add(letter);
            }
            if (letters.size() > 2) {
                Collections.shuffle(letters.subList(1, letters.size() - 1));
            }
            for (char letter : letters) {
                builder.append(letter);
            }
            builder.append(" ");
        }
        return builder.toString();
    }

    public String strinTokanizerMethod(String sentence) {

        StringTokenizer sTokenizer = new StringTokenizer(sentence,", .", true);
        StringBuilder builder = new StringBuilder();
        while (sTokenizer.hasMoreElements()) {
            String word = sTokenizer.nextToken();
            List<Character> letters = new ArrayList<>();
            for (char letter : word.toCharArray()) {
                letters.add(letter);
            }
            if (letters.size() > 2) {
                Collections.shuffle(letters.subList(1, letters.size() - 1));
            }
            for (char letter : letters) {
                builder.append(letter);
            }
        }
        return builder.toString();
    }
}

