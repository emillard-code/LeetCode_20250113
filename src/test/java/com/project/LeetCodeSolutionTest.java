package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void countVowelStringsInRangeTest() {

        assertEquals(5, LeetCodeSolution.minimumLength("abaacbcbb"));
        assertEquals(2, LeetCodeSolution.minimumLength("aa"));

    }

}
