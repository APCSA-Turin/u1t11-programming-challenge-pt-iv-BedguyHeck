package com.example.project;

public class StringProblems {
    // Empty constructor
    public StringProblems() {}

    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x) {
        if (x == null || x.length() < 2) return false;
        return x.endsWith("ly");
    }

    // Given two strings, append them together (concatenation),
    // but if concatenation creates a double-char, omit one of them.
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2) {
        if (s1.isEmpty()) return s2;
        if (s2.isEmpty()) return s1;
        if (s1.charAt(s1.length() - 1) == s2.charAt(0))
            return s1 + s2.substring(1);
        return s1 + s2;
    }

    // Given a string, return a version without the first 2 chars,
    // except keep the first char if it is 'a' and keep the second char if it is 'b'.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") → "apple"
    // deFront("abee") → "abee"
    // deFront("ab") → "ab"
    // deFront("a") → "a"
    // deFront("ba") → ""
    public String deFront(String s1) {
        if (s1.isEmpty()) return "";
        StringBuilder result = new StringBuilder();
        if (s1.length() >= 1 && s1.charAt(0) == 'a')
            result.append('a');
        if (s1.length() >= 2 && s1.charAt(1) == 'b')
            result.append('b');
        if (s1.length() > 2)
            result.append(s1.substring(2));
        return result.toString();
    }

    // Given a string, if the first or last chars are 'x',
    // return the string without those 'x' chars, otherwise return unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    // withoutX("") → ""
    public String withoutX(String s1) {
        if (s1.isEmpty()) return "";
        int start = 0, end = s1.length();

        if (s1.charAt(0) == 'x') start = 1;
        if (s1.length() > 1 && s1.charAt(s1.length() - 1) == 'x') end--;
        if (start >= end) return "";
        return s1.substring(start, end);
    }

    // Given a string, if it starts with 'f' return "Fizz",
    // if it ends with 'b' return "Buzz",
    // if both, return "FizzBuzz",
    // otherwise return the string unchanged.
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1) {
        boolean startsF = s1.startsWith("f");
        boolean endsB = s1.endsWith("b");

        if (startsF && endsB) return "FizzBuzz";
        if (startsF) return "Fizz";
        if (endsB) return "Buzz";
        return s1;
    }

    // Given an int n, return the string form of the number followed by "!".
    // Except: if divisible by 3 use "Fizz", if divisible by 5 use "Buzz",
    // if divisible by both 3 and 5 use "FizzBuzz".
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x) {
        if (x % 3 == 0 && x % 5 == 0) return "FizzBuzz!";
        if (x % 3 == 0) return "Fizz!";
        if (x % 5 == 0) return "Buzz!";
        return x + "!";
    }
}
