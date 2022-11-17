package com.example.demo;

/*
* Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
*/

public class middleWay
{
    public int[] middleWay(int[] a, int[] b)
    {
        int[] newArr = new int[2];
        newArr[0] = a[1];
        newArr[1] = b[1];
        return newArr;
    }
}
