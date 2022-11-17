package com.example.demo;

/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, 
then set "c" to have the longer value. If the values exist and have the same length, 
change them both to the empty string in the map.
*/

import java.util.Map;

public class mapAB4
{
    public static Map<String, String> mapAB4(Map<String, String> map)
    {
        if (map.containsKey("a") && map.containsKey("b"))
        {
            int aLength = map.get("a").length();
            int bLength = map.get("b").length();

            if (aLength == bLength)
            {
                map.put("a", "");
                map.put("b", "");
            }

            if (aLength > bLength)
            {
                map.put("c", map.get("a"));
            }
            if (bLength > aLength)
            {
                map.put("c", map.get("b"));
            }
        }

        return map;
    }
}
