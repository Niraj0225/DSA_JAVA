package String;

public class StringCompression {
    //time complexity = O(n)
    //space complexity=O(1)
    static int compressOptimize(char[] chars) {
        // Pointer used to traverse the input array
        int travelIndex = 0;

// Pointer used to store the compressed result
        int storeIndex = 0;

// Traverse the entire character array
        while (travelIndex < chars.length) {

            // Store the current character
            char currentChar = chars[travelIndex];

            // Count how many times the current character appears consecutively
            int count = 0;

            // Count consecutive occurrences of currentChar
            while (travelIndex < chars.length && currentChar == chars[travelIndex]) {

                // Move to the next character
                travelIndex++;

                // Increase the frequency count
                count++;
            }

            // Store the current character in the compressed array
            chars[storeIndex] = currentChar;
            storeIndex++;

            // If the character appears more than once,
            // store its count after the character
            if (count > 1) {

                // Convert count to a String
                // Example:
                // 12 -> "12"
                String countString = String.valueOf(count);

                // Store each digit of the count separately
                // Example:
                // "12" -> '1', '2'
                for (char digit : countString.toCharArray()) {

                    chars[storeIndex] = digit;
                    storeIndex++;
                }
            }
        }

// Return the length of the compressed array
        return storeIndex;
    }
    static void main() {
      char[] chars =  {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compressOptimize(chars));
    }
}
