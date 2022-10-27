package com.example.demo;

public class answerCell
{
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        if (isAsleep)
        {
            return false;
        }

        if (isMorning)
        {
            if (isMom)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        return true;
    }
}
