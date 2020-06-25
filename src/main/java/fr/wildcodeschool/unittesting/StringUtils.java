package fr.wildcodeschool.unittesting;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtils {
    private static final String ALL_VOWELS = "aeiouAEIOU";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        if (candidate == null) return null;
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères, sans doublon
     * @return Chaine avec uniquement des voyelles, sans doublon
     */
    public static String uniqueVowels(String candidate) {
        if (candidate == null) return null;
        String vowels = "";
        char[] letters = candidate.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char l : letters) {
            if ( ALL_VOWELS.indexOf(l) >=0 ) {
                charSet.add(l);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : charSet) {
            sb.append(c);
        }
        vowels = sb.toString();

        return vowels;
    }
}
