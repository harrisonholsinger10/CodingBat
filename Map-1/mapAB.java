package com.example.demo;

import java.util.Map;

public class mapAB
{
    public static Map<String, String> mapAB(Map<String, String> map)
    {
        if (map.containsKey("a") && map.containsKey("b"))
        {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}
