/*
Created by Jashin Parhar
Date: 08/01/2022 1:05AM

Runtime: 7 ms, faster than 71.74% of Java online submissions for Roman to Integer.
Memory Usage: 45.1 MB, less than 69.72% of Java online submissions for Roman to Integer.

*/

class RomanNumerals {
    public int romanToInt(String s) {
        int result = 0;


            for (int i = 0; i < s.length(); i++) {
                if (i != s.length()-1) {
                    if (symbolToInt(s.charAt(i)) < symbolToInt(s.charAt(i + 1))) {
                        result -= symbolToInt(s.charAt(i));
                    } else
                        result += symbolToInt(s.charAt(i));
                } else {
                    result += symbolToInt(s.charAt(i));
                }
            }



        return result;
    }

    public int symbolToInt(char r) {
        if (r == 'I') {
            return 1;
        } else if (r == 'V') {
            return 5;
        } else if (r == 'X') {
            return 10;
        } else if (r == 'L') {
            return 50;
        } else if (r == 'C') {
            return 100;
        } else if (r == 'D') {
            return 500;
        } else if (r == 'M') {
            return 1000;
        } else {
            return 0;
        }
    }

}