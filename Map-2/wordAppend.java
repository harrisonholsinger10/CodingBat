package com.example.demo;

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
