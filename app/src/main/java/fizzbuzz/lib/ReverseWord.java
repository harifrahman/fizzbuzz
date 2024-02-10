package fizzbuzz.lib;

import java.util.ArrayList;

public class ReverseWord {

    public String reverseWord(String input) {
        String[] listOfWord = input.split(" ");
        ArrayList<String> words = new ArrayList<>();

        for (String s : listOfWord) {
            words.add(0, s);
        }

        return String.join(" ", words);
    }
}
