package com.example.demo;

import java.util.Map;

public class topping2
{
    public static Map<String, String> topping2(Map<String, String> map)
    {
        if (map.containsKey("ice cream"))
        {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach"))
        {
            map.put("spinach", "nuts");
        }

        return map;
    }
}
