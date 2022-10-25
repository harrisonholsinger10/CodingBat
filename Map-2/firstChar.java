package com.example.demo;

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
