package SmoothSailing

// Given an array of strings, return another array containing all of its longest strings.

fun allLongestStrings(inputArray: MutableList<String>) =
    inputArray.filter {
        it.length == inputArray.maxBy { it.length }?.length
    }

