package SmoothSailing

import kotlin.math.min

// Given two strings, find the number of common characters between them.

fun commonCharacterCount(s1: String, s2: String) =

    // First we create a set of s1 to get a collection of elements that does not repeat
    // Then we count in both strings the characters in set, the counter with min value
    // is returned

    s1.toSet().map { char ->
        min(
            s1.count { it == char },
            s2.count { it == char }
        )
    }.sum()

