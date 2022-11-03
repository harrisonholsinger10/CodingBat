package com.example.demo;

/*
* Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the
* numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays,
* taking advantage of the fact that both arrays are already in sorted order.
*/

public class linearIn
{
    public boolean linearIn(int[] outer, int[] inner)
    {
        int numFound = 0;
        if(inner.length == 0)
        {
            return true;
        }

        int k = 0;
        for (int i = 0; i < outer.length; i++)
        {
            if (outer[i] == inner[k])
            {
                numFound++;
                k++;
            }
            else if(outer[i] > inner[k])
            {
                return false;
            }

            if (numFound == inner.length)
                return true;
        }

        return false;
    }
}
