package com.example.demo;

/*
* Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
* but not the 'y' in "yellow" (not case-sensitive).
* We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
* (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
* */

public class countYZ
{
    public int countYZ(String str)
    {
        int len = str.length();
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < len; i++)
        {

            if (str.charAt(i) == 'y' || str.charAt(i) == 'z')
            {
                if (i < len-1 && !Character.isLetter(str.charAt(i + 1)))
                    count++;
                else if (i == len - 1)
                    count++;
            }
        }
        return count;
    }

}
