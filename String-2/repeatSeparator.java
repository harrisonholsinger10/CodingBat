package com.example.demo;

public class repeatSeparator
{
    public String repeatSeparator(String word, String sep, int count)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++)
        {
            if (i != 0)
            {
                builder.append(sep);
            }
            builder.append(word);
        }
        return builder.toString();
    }

}
