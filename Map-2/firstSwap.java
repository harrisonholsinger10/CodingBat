package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class firstSwap
{
    public String[] firstSwap(String[] strings)
    {
        Map<String, Integer> map = new HashMap();

        for (int i = 0; i < strings.length; i++)
        {
            String string = String.valueOf(strings[i].substring(0, 1));

            if (map.containsKey(string))
            {
                int value = map.get(string);
                if (value == -1)
                {
                    continue;
                }

                int pos = map.get(string);
                String temp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = temp ;
                map.put(string, -1);
            }
            else
            {
                map.put(string, i);
            }
        }
        return strings;
    }
}
