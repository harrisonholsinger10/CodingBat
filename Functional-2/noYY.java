package com.example.demo;

/*
* Given a list of strings, return a list where each string has "y" added at its end, 
* omitting any resulting strings that contain "yy" as a substring anywhere.
*/

import java.util.List;
import java.util.stream.Collectors;

public class noYY
{
    public List<String> noYY(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> x + "y")
                        .filter(x -> !x.toLowerCase().contains("yy"))
                        .collect(Collectors.toList());
    }
}
