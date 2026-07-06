package String;

public class ReverserStringByWord {

    //Time: O(n) Space: O(n)
    static String reverseStringByWord(String s){
        // Split the string by spaces
        String[] words = s.split(" ");

        StringBuilder ans = new StringBuilder();

        // Traverse the array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {

            // Ignore empty strings caused by multiple spaces
            if (!words[i].equals("")) {

                // Add space before every word except the first one
                if (ans.length() > 0) {
                    ans.append(" ");
                }

                ans.append(words[i]);
            }
        }

        return ans.toString();
    }

    //optimize solution
    //TC=O(n)
    static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        // Start from the last character of the string
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip all trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // If no characters are left, stop
            if (i < 0) {
                break;
            }

            // 'j' will move to the beginning of the current word
            int j = i;

            // Find the start index of the current word
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Append the current word to the result
            ans.append(s.substring(j + 1, i + 1));

            // Add a space if there are more words remaining
            if (j > 0) {
                ans.append(' ');
            }

            // Continue searching from before the current word
            i = j;
        }

        // Remove any extra space at the end and return the result
        return ans.toString().trim();
    }
    static void main() {
        String s= "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
