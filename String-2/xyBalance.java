package com.example.demo;

public class xyBalance
{
    public boolean xyBalance(String str)
    {
        if (str.indexOf('y') == -1 && str.indexOf('x') == -1)
            return true;

        if (str.indexOf('x') != -1 && str.indexOf('y') == -1)
            return false;

        return (str.lastIndexOf('x') < str.lastIndexOf('y'));
    }
}
