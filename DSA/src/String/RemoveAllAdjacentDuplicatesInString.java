package String;

/*
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
and this is the only possible move.  The result of this move is that the string is "aaca",
of which only "aa" is possible, so the final string is "ca".
 */

public class RemoveAllAdjacentDuplicatesInString {
    // Brute Force Approach
    // Time Complexity: O(n²)
    // Space Complexity: O(n)

     static String removeDuplicatesBrute(String s) {

        int i = 0;

        while (i < s.length() - 1) {

            // Check if adjacent characters are same
            if (s.charAt(i) == s.charAt(i + 1)) {

                // Remove both duplicate characters
                s = s.substring(0, i) + s.substring(i + 2);

                // Start again from the beginning
                i = 0;
            } else {
                i++;
            }
        }

        return s;
    }


    //Time Complexity: O(n)
    //Space Complexity: O(n) (in the worst case, no characters are removed, so all characters are stored).
    static String removeDuplicatesOPTIMIZE(String s) {
        // StringBuilder is used as a stack to store the result
        StringBuilder ans = new StringBuilder();

        // Traverse each character of the input string
        for (int i = 0; i < s.length(); i++) {

            // Get the current character
            char ch = s.charAt(i);

            // Check:
            // 1. ans is not empty
            // 2. Last character in ans is same as current character
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ch) {

                // Duplicate found
                // Remove the last character from ans
                ans.deleteCharAt(ans.length() - 1);

            } else {

                // No duplicate
                // Add current character to ans
                ans.append(ch);
            }
        }

        // Convert StringBuilder to String and return
        return ans.toString();
    }
    static void main() {
        String  s = "abbaca";
        System.out.println(removeDuplicatesOPTIMIZE(s));
    }
}
