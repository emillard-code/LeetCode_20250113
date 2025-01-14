package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void countVowelStringsInRangeTest() {

        assertEquals(5, LeetCodeAttempt.minimumLengthOfStringAfterOperations("abaacbcbb"));
        assertEquals(2, LeetCodeAttempt.minimumLengthOfStringAfterOperations("aa"));

    }

}
