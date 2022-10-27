package com.example.demo;

public class nearTen
{
    public boolean nearTen(int num)
    {
        return (num % 10 <= 2) || (num % 10 >= 8);
    }
}
