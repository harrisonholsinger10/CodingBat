package com.example.demo;

/*
* Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
*/

import java.util.List;
import java.util.stream.Collectors;

public class copies3
{
    public List<String> copies3(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> x + x + x)
                        .collect(Collectors.toList());
    }
}
