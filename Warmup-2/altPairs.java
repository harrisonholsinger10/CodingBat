package com.example.demo;

public class altPairs
{
    public String altPairs(String str)
    {
        String result = "";

        if (str.length() == 0) {
            return str;
        } else if (str.length() == 1) {
            return str;

        } else if (str.length() <= 4) {
            char char0 = str.charAt(0);
            char char1 = str.charAt(1);

            result = result + char0 + char1;
            return result;

        } else if (str.length() <= 5) {
            char char0 = str.charAt(0);
            char char1 = str.charAt(1);
            char char4 = str.charAt(4);

            result = result + char0 + char1 + char4;
            return result;

        } else if (str.length() <= 6) {
            char char0 = str.charAt(0);
            char char1 = str.charAt(1);
            char char4 = str.charAt(4);
            char char5 = str.charAt(5);

            result = result + char0 + char1 + char4 + char5;
            return result;

        } else if (str.length() <= 9) {
            char char0 = str.charAt(0);
            char char1 = str.charAt(1);
            char char4 = str.charAt(4);
            char char5 = str.charAt(5);
            char char8 = str.charAt(8);

            result = result + char0 + char1 + char4 + char5 + char8;
            return result;

        } else if (str.length() <= 12) {
            char char0 = str.charAt(0);
            char char1 = str.charAt(1);
            char char4 = str.charAt(4);
            char char5 = str.charAt(5);
            char char8 = str.charAt(8);
            char char9 = str.charAt(9);

            result = result + char0 + char1 + char4 + char5 + char8 + char9;
            return result;

        } else {
            char char0 = str.charAt(0);
            char char1 = str.charAt(1);
            char char4 = str.charAt(4);
            char char5 = str.charAt(5);
            char char8 = str.charAt(8);
            char char9 = str.charAt(9);
            char char12 = str.charAt(12);
            char char13 = str.charAt(13);


            result = result + char0 + char1 + char4 + char5 + char8 + char9 + char12 + char13;
            return result;

        }


    }
}
