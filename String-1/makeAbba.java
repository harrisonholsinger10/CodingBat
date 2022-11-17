package com.example.demo;

/*
* Given two strings, a and b, return the result of putting them together in the order abba, 
* e.g. "Hi" and "Bye" returns "HiByeByeHi".
*/

public class makeAbba
{
    public String makeAbba(String a, String b)
    {
        return a + b + b + a;
    }
}
