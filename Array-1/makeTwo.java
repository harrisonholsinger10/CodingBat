package com.example.demo;

/*
* Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
* the elements from a followed by the elements from b. The arrays may be any length, including 0, 
* but there will be 2 or more elements available between the 2 arrays.
*/

public class makeTwo
{
    public int[] make2(int[] a, int[] b)
    {
        int[] newArr = new int[2];
        int position = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (position == 2)
            {
                return newArr;
            }

            newArr[i] = a[i];
            position++;
        }

        if (position == 2)
        {
            return newArr;
        }

        if (b.length != 0)
        {
            for(int i = 0; i < b.length; i++)
            {
                if(position == 2)
                {
                    return newArr;
                }
                newArr[position] = b[i];
                position++;
            }
        }
        return newArr;
    }
}
