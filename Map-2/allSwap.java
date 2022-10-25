package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class allSwap
{
    public String[] allSwap(String[] strings)
    {
        Map<String, Integer> map = new HashMap();

        for (int i = 0; i < strings.length; i++)
        {
            if (map.containsKey(strings[i].charAt(0) + ""))
            {
                String string = strings[i];
                strings[i] = strings[map.get(strings[i].charAt(0) + "")];
                strings[map.get(strings[i].charAt(0) + "")] = string;
                map.remove(strings[i].charAt(0) + "");
            }
            else
            {
                map.put(strings[i].charAt(0) + "", i);
            }
        }
        return strings;
    }

}
