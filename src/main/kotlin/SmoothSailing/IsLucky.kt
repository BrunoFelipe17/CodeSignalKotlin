package SmoothSailing

import kotlin.math.log10

/*
Ticket numbers usually consist of an even number of digits.
A ticket number is considered lucky if the sum of the first half
of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.
 */

fun isLucky(n: Int): Boolean {
    val str = n.toString().chunked(n.toString().length / 2)
    return str[0].chars().sum() == str[1].chars().sum()
}