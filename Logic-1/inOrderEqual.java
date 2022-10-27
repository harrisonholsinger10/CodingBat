package com.example.demo;

public class inOrderEqual
{
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        if (equalOk)
        {
            if (a <= b && b <= c)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        return a < b && b < c;
    }
}
