package stringutils;


public class StringUtils
{
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public boolean isPalindrome(String input) {
        // Checks if the input string is a palindrome
        // Example: "radar" -> true, "hello" -> false
        String reversed = reverse(input);
        return input.equals(reversed);
    }
    public String concatenate(String str1, String str2) {
        // Concatenates two strings
        // Example: concatenate("Hello", "World") -> "HelloWorld"
        return str1 + str2;
    }
    public int countOccurrences(String input, char target) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
