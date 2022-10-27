package com.example.demo;

public class startFront
{
    public String startWord(String str, String word)
    {
        if
        (str.length() < 1 || str.length() < word.length())
        {
            return "";
        }

        if (str.length() == 1 && !str.equals(word))
        {
            return str;
        }

        String keepThis = str.substring(1, word.length());

        if (keepThis.equals(word.substring(1)))
        {
            return str.substring(0, word.length());
        }
        return "";
    }
}
