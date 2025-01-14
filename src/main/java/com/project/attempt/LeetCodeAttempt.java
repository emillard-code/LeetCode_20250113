package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(minimumLengthOfStringAfterOperations("abaacbcbb"));
        System.out.println(minimumLengthOfStringAfterOperations("aa"));

    }

    public static int minimumLengthOfStringAfterOperations(String s) {

        StringBuilder sBuilder = new StringBuilder(s);

        for (int i = 0; i < sBuilder.length(); i++) {

            int leftmostIndex = -1;
            int rightmostIndex = -1;

            for (int j = 0; j < sBuilder.length(); j++) {

                if (sBuilder.charAt(i) == sBuilder.charAt(j)) {

                    if (j < i && leftmostIndex == -1) { leftmostIndex = j; }
                    else if (j < i && j > leftmostIndex) { leftmostIndex = j; }
                    if (j > i && rightmostIndex == -1) { rightmostIndex = j; }

                }

            }

            if (leftmostIndex != -1 && rightmostIndex != -1) {
                sBuilder.deleteCharAt(rightmostIndex);
                sBuilder.deleteCharAt(leftmostIndex);
                i--;
            }

        }

        return sBuilder.length();

    }

}
