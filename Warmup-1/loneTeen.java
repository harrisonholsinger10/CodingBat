package com.example.demo;

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
