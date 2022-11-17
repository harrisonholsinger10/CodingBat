package com.example.demo;

/*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. 
time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
*/

import java.util.HashMap;
import java.util.Map;

public class wordAppend
{
    public String wordAppend(String[] strings)
    {
        Map<String, Integer> map = new HashMap();
        String string = "";

        for(String s: strings)
        {
            String key = s;

            if (map.containsKey(key))
            {
                int value = map.get(key);
                value++;

                if (value % 2 == 0)
                {
                    string += key;
                }
                map.put(key, value);

            }
            else
            {
                map.put(key, 1);
            }
        }
        return string;
    }
}
