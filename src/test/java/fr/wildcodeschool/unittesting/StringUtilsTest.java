package fr.wildcodeschool.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    public void testVowels() {
        String phrase = "bonjour";
        assertEquals("oou", StringUtils.vowels(phrase), "bonjour should return oou");
        assertEquals("ou", StringUtils.uniqueVowels(phrase), "bonjour should return ou");
    }
    // Test avec un mot sans voyelle.
    @Test
    public void testIfNoVowels() {
        String phrase = "zrtgjkvxr mlkj nnr";
        assertEquals("", StringUtils.vowels(phrase), "le mot n'a pas de voyelle");
        assertEquals("", StringUtils.uniqueVowels(phrase), "le mot n'a pas de voyelle");
    }
    @Test
    public void testVowelsIfNull() {
        String phrase = null;
        assertEquals(null, StringUtils.vowels(phrase), "there is a null entry");
        assertEquals(null, StringUtils.uniqueVowels(phrase), "there is a null entry");
    }
    // Test si la phrase commence par une voyelle.
    @Test
    public void testVowelsIfStartWithVowel() {
        String phrase = "affected";
        assertEquals("aee", StringUtils.vowels(phrase), "Test si la phrase commence par une " +
                "voyelle");
        assertEquals("ae", StringUtils.uniqueVowels(phrase), "Test si la phrase commence par une voyelle");
    }
    // Test si la phrase fini par une voyelle.
    @Test
    public void testVowelsIfFinishWithVowel() {
        String phrase = "crevette";
        assertEquals("eee", StringUtils.vowels(phrase), "Test si la phrase fini par une voyelle");
        assertEquals("e", StringUtils.uniqueVowels(phrase), "Test si la phrase fini par une voyelle");
    }
    // Test avec une phrase de plusieurs mots
    @Test
    public void testVowelsIfThereIsMultipleWords() {
        String phrase = "hello how are you?";
        assertEquals("eooaeou", StringUtils.vowels(phrase), "Test avec une phrase de plusieurs mots");
        assertEquals("eoau", StringUtils.uniqueVowels(phrase), "Test avec une phrase de plusieurs mots");
    }
}
