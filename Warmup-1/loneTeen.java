package com.example.demo;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
*/

public class loneTeen
{
    public boolean loneTeen(int a, int b) {
        if (a <= 19 && a >= 13 && b <= 19 && b >= 13) {
            return false;
        }
        if (a <= 19 && a >= 13 || b <= 19 && b >= 13) {
            return true;
        } else {
            return false;
        }
    }
}
