package com.example.demo;

/*
* Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
*/

import java.util.List;
import java.util.stream.Collectors;

public class noZ
{
    public List<String> noZ(List<String> strings)
    {
        return
                strings.stream()
                        .filter(x -> !x.contains("z") && !x.contains("Z")) // uppercase and lowercase "z"
                        .collect(Collectors.toList());

    }
}
