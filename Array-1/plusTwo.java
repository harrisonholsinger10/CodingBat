package com.example.demo;

/*
* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
*/

public class plusTwo
{
    public int[] plusTwo(int[] a, int[] b)
    {
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;
    }
}
