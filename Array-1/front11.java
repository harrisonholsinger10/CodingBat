package com.example.demo;

/*
* Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
* If either array is length 0, ignore that array.
*/

public class front11
{
    public int[] front11(int[] a, int[] b)
    {
        int sizeOfArr = 0;

        if (a.length != 0)
        {
            sizeOfArr++;
        }

        if(b.length != 0)
        {
            sizeOfArr++;
        }

        int[] newArr = new int[sizeOfArr];
        int position = 0;
        if (a.length != 0)
        {
            newArr[position] = a[0];
            position++;
        }

        if (b.length != 0)
        {
            newArr[position] = b[0];
        }
        return newArr;
    }
}
