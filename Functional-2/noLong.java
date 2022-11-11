package com.example.demo;

/*
* Given a list of strings, return a list of the strings, omitting any string length 4 or more.
*/

import java.util.List;
import java.util.stream.Collectors;

public class noLong
{
    public List<String> noLong(List<String> strings)
    {
        return
                strings.stream()
                        .filter(x -> x.length() < 4)
                        .collect(Collectors.toList());
    }
}
