package com.example.demo;

/*
* Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
*/

import java.util.List;
import java.util.stream.Collectors;

public class lower
{
    public List<String> lower(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> x.toLowerCase())
                        .collect(Collectors.toList());
    }
}
