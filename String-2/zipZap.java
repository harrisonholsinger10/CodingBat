package com.example.demo;

/*
* Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. 
* Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
*/

public class zipZap
{
    public String zipZap(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i != 0) {
                if (i == str.length() - 1) {
                    builder.append(str.charAt(i) + "");
                } else if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {

                } else {
                    builder.append(str.charAt(i) + "");
                }
            } else {
                builder.append(str.charAt(i) + "");
            }
        }

        return builder.toString();
    }
}
