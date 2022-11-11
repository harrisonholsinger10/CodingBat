package com.example.demo;

/*
Given an array of strings, return a Map<String, Boolean> where each different string 
is a key and its value is true if that string appears 2 or more times in the array.
*/

import java.util.HashMap;
import java.util.Map;

public class wordMultiple
{
    public Map<String, Boolean> wordMultiple(String[] strings)
    {
        Map<String, Integer> stringCount = new HashMap();
        Map<String, Boolean> map = new HashMap();

        for(String s: strings)
        {
            String key = s;
            if(stringCount.containsKey(key))
            {
                int count = stringCount.get(key);
                count++;
                stringCount.put(key, count);
            }
            else
            {
                stringCount.put(key, 1);
            }
            map.put(key, stringCount.get(key) >= 2);
        }
        return map;
    }
}
