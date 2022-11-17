package com.example.demo;

/*
* Given an "out" string length 4, such as "<<>>", and a word, 
* return a new string where the word is in the middle of the out string, 
* e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
*/

public class makeOutWord
{
    public String makeOutWord(String out, String word)
    {
        String firstHalf = out.substring(0, out.length()/2);
        return firstHalf + word + out.substring(out.length()/2);
    }
}
