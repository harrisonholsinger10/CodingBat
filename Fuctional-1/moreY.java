package com.example.demo;

/*
* Given a list of strings, return a list where each string has "y" added at its start and end.
*/

import java.util.List;
import java.util.stream.Collectors;

public class moreY
{
    public List<String> moreY(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> "y" + x + "y")
                        .collect(Collectors.toList());
    }
}
