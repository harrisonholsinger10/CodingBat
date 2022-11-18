package com.example.demo;

/*
* You have a blue lottery ticket, with ints a, b, and c on it. 
* This makes three pairs, which we'll call ab, bc, and ac. 
* Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. 
* Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
*/

public class blueTicket
{
    public int blueTicket(int a, int b, int c)
    {
        if (a + b == 10 || b + c == 10 || a + c == 10)
            return 10;

        int abSum = a + b;

        if ((abSum - (b+c) >= 10) || (abSum - (a+c) >= 10))
            return 5;

        return 0;
    }
}
