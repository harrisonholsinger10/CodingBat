package com.example.demo;

/*
The classic word-count algorithm: given an array of strings, 
return a Map<String, Integer> with a key for each different string, 
with the value the number of times that string appears in the array.
*/

import java.util.HashMap;
import java.util.Map;

public class wordCount
{
    public Map<String, Integer> wordCount(String[] strings)
    {
      Map<String, Integer> map = new HashMap();

      for(String s:strings)
      {
        String tmp = s;

        if (map.containsKey(tmp))
        {
            int count = map.get(tmp);
            map.put(tmp, count + 1);
        }
        else
        {
            map.put(tmp, 1);
        }
      }
      return map;
    }
}
