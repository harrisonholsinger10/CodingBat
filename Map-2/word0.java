package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class word0
{
    public Map<String, Integer> word0(String[] strings)
    {
        Map<String, Integer> map = new HashMap();

        for (String s:strings)
        {
            map.put(s, 0);
        }
        return map;
    }
}
