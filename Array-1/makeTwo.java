package com.example.demo;

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
