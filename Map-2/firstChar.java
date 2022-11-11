package com.example.demo;

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, 
with the value of all the strings starting with that character appended together in the order they appear in the array.
*/

import java.util.HashMap;
import java.util.Map;

public class firstChar
{
    public Map<String, String> firstChar(String[] strings)
    {
        Map<String, String> map = new HashMap();

        for (String s: strings)
        {
            String key = s.charAt(0) + "";

            if (map.containsKey(key))
            {
                String value = map.get(key) + s;
                map.put(key, value);

            }
            else
            {
                map.put(key, s);
            }
        }
        return map;
    }
}
