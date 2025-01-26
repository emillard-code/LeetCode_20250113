package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(minimumLengthOfStringAfterOperations("abaacbcbb"));
        System.out.println(minimumLengthOfStringAfterOperations("aa"));

    }

    // As per challenge instructions, this method will return the minimum size
    // of string s after performing as many processes on it as possible.
    public static int minimumLengthOfStringAfterOperations(String s) {

        // We create a StringBuilder to work with a more mutable string object.
        StringBuilder sBuilder = new StringBuilder(s);

        // We iterate through the main string with a for-loop, and for each sBuilder[i]
        // we try to detect identical characters to the left and right of said sBuilder[i].
        for (int i = 0; i < sBuilder.length(); i++) {

            // These indexes are mostly for detecting the closest indexes on the left and right
            // of the current sBuilder[i] that contains an identical character to it. They are
            // set to -1 as a default, and will only get another value if any indexes exist on
            // left and right of the current sBuilder[i] that contain an identical character.
            int leftIndex = -1;
            int rightIndex = -1;

            // We loop another time within the previous for-loop to detect if there are
            // identical characters on any of the left and right indexes.
            for (int j = 0; j < sBuilder.length(); j++) {

                if (sBuilder.charAt(i) == sBuilder.charAt(j)) {

                    // The leftIndex will have to be adjusted to see if there are
                    // any closer ones to current [i] index. The rightIndex does not need
                    // any adjustment as the first one detected is automatically the closest.
                    if (j < i && leftIndex == -1) { leftIndex = j; }
                    else if (j < i && j > leftIndex) { leftIndex = j; }
                    if (j > i && rightIndex == -1) { rightIndex = j; }

                }

            }

            // If an identical character is detected on both the left and right indexes, then
            // we delete both of them and decrement i by 1 to account for the left index deletion.
            if (leftIndex != -1 && rightIndex != -1) {
                sBuilder.deleteCharAt(rightIndex);
                sBuilder.deleteCharAt(leftIndex);
                i--;
            }

        }

        // After the loops are over, we return the string that is left.
        return sBuilder.length();

    }

}
