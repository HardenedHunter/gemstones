package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * Converts given string into a set of characters.
     *
     * @param source String that is used to extract characters.
     */
    private static Set<Character> getCharacters(String source) {
        if (source == null)
            throw new NullPointerException("source == null");

        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < source.length(); i++)
            chars.add(source.charAt(i));
        return chars;
    }

    /**
     * Counts the number of gems in a string.
     *
     * @param gems String that describes what characters are gems.
     * @param source String to count gems from.
     * */
    private static int countGems(String gems, String source) {
        if (gems == null)
            throw new NullPointerException("gems == null");

        if (source == null)
            throw new NullPointerException("source == null");

        Set<Character> chars = getCharacters(gems);
        int totalGems = 0;
        for (int i = 0; i < source.length(); i++)
            if (chars.contains(source.charAt(i)))
                ++totalGems;
        return totalGems;
    }

    public static void main(String[] args) {
        String s = "abcDEF";
        String j = "AbedFF";

        int totalGems = countGems(s, j);

        System.out.println(totalGems);
    }
}
