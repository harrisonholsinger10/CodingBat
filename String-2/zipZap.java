package com.example.demo;

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
