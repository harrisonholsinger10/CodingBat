package com.example.demo;

public class stringE
{
    public boolean stringE(String str)
    {
        String[] arr = str.split("");
        int countE = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if (arr[i].equalsIgnoreCase("e"))
            {
                countE++;
            }
        }

        if (countE >= 1 && countE <= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
