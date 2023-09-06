package palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void isPalindrome_True() {
        String twoCharText = "aa"; // even
        String evenLengthText = "homeemoh"; // even
        String oddLengthText = "homenemoh"; // odd
        String emptyText = "";

        assertTrue(StringUtils.isPalindrome(twoCharText));
        assertTrue(StringUtils.isPalindrome(evenLengthText));
        assertTrue(StringUtils.isPalindrome(oddLengthText));
        assertTrue(StringUtils.isPalindrome(emptyText));
        assertTrue(StringUtils.isPalindrome(null));
    }

    @Test
    public void isPalindrome_False() {
        String twoCharText = "ab"; // even
        String evenLengthText = "homeamoh"; // even
        String oddLengthText = "homenamoh"; // odd

        assertFalse(StringUtils.isPalindrome(twoCharText));
        assertFalse(StringUtils.isPalindrome(evenLengthText));
        assertFalse(StringUtils.isPalindrome(oddLengthText));
    }
}
