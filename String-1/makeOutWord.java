package com.example.demo;

public class makeOutWord
{
    public String makeOutWord(String out, String word)
    {
        String firstHalf = out.substring(0, out.length()/2);
        return firstHalf + word + out.substring(out.length()/2);
    }
}
