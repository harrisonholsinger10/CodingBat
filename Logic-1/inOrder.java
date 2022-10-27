package com.example.demo;

public class inOrder
{
    public boolean inOrder(int a, int b, int c, boolean bOk)
    {
        if (bOk)
        {
            if (c > b)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        return b > a && c > b;
    }
}
