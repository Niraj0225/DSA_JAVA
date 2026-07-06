package String;
/*
Given a string s of lowercase alphabets. The task is to find the maximum occurring character in
the string s. If more than one character occurs the maximum number of times then print the
lexicographically smaller character.

Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.
*/
public class MostFrequentCharacter {

    // ---------------- BRUTE FORCE APPROACH ----------------
    // Time Complexity : O(n²)
    // Space Complexity: O(1)
    static char findMaxOccuringChar(String s) {

        int maxFreq = 0;      // Stores the highest frequency found so far
        char ans = 'z';       // Stores the answer (initialized to 'z')

        // Pick each character one by one
        for (int i = 0; i < s.length(); i++) {

            int count = 0;    // Count frequency of current character

            // Compare current character with every character in the string
            for (int j = 0; j < s.length(); j++) {

                // If both characters are same, increment count
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            /*
             * Update answer if:
             * 1. Current character frequency is greater than max frequency
             * 2. OR frequency is same but current character is
             *    alphabetically smaller than previous answer
             */
            if (count > maxFreq ||
                    (count == maxFreq && s.charAt(i) < ans)) {

                maxFreq = count;
                ans = s.charAt(i);
            }
        }

        return ans;
    }

    // ---------------- OPTIMIZED APPROACH ----------------
    // Time Complexity : O(n)
    // Space Complexity: O(1) (26 characters)

    static char getMaxOccuringChar(String s) {

        // Frequency array for lowercase letters a-z
        int[] freq = new int[26];

        // Count frequency of every character
        for (int i = 0; i < s.length(); i++) {

            char currChar = s.charAt(i);

            // Convert character to array index
            // Example:
            // 'a' -> 0
            // 'b' -> 1
            // 'm' -> 12
            // 'z' -> 25
            freq[currChar - 'a']++;
        }

        int maxFreq = -1;
        char ans = 'a';

        // Traverse frequency array
        for (int i = 0; i < 26; i++) {

            // If current frequency is greater than maximum
            if (freq[i] > maxFreq) {

                maxFreq = freq[i];

                // Convert array index back to character
                // Example:
                // 0  -> 'a'
                // 1  -> 'b'
                // 12 -> 'm'
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "testsample";

        System.out.println("Brute Force : " + findMaxOccuringChar(s));
        System.out.println("Optimized   : " + getMaxOccuringChar(s));
    }
}