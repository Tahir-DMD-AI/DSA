public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        // length different then it is not anagram
        if (str1.length() != str2.length()) {
            return false;
        }
        // Create an array to count the frequency of each character.
        int[] charCount = new int[256]; 
        // Count characters in str1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }
        // Subtract the count for each character in str2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }
        // If all counts are zero, then the strings are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}