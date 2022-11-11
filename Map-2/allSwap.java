package com.example.demo;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
Loop over and then return the given array of non-empty strings as follows: 
if a string matches an earlier string in the array, swap the 2 strings in the array. 
When a position in the array has been swapped, it no longer matches anything. 
Using a map, this can be solved making just one pass over the array. More difficult than it looks.
*/

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
