package pl.com.bottrga.application;

import pl.com.bottrga.model.operationOnString;

/**
 * Created by arkadiuszarak on 07/04/2016.
 */
public class TestConsoleApplication {

    public static void main(String[] args) {

        shouldTokanizerText();

        shouldSplitText();

    }

    private static void shouldTokanizerText() {
        String sentence = "Napiszcie klasę, która przetwarza tekst wejściowy podany w stringu w na sposób opisany wyżej.";
        operationOnString testTokanizer = new operationOnString();
        System.out.println(testTokanizer.strinTokanizerMethod(sentence));
    }

    private static void shouldSplitText() {

        String sentence = "Napiszcie klasę, która przetwarza tekst wejściowy podany w stringu w na sposób opisany wyżej.";
        operationOnString testSplit = new operationOnString();
        System.out.println(testSplit.splitMethod(sentence));
    }
}
