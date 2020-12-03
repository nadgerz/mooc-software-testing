package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static final Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {
        int convertedNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            int thisCharVal = map.get(thisChar);

            char nextChar;
            int nextCharVal = 0;

            if ((i + 1) != s.length()) {
                nextChar = s.charAt(i + 1);
                nextCharVal = map.get(nextChar);
            }

            if (nextCharVal > thisCharVal) {
                convertedNumber += nextCharVal - thisCharVal;
                i++;
            } else {
                convertedNumber += thisCharVal;
            }

            // VX and XXC should fail!

/*
            if (s.charAt(i) == 'I') convertedNumber += 1;
            if (s.charAt(i) == 'V') convertedNumber += 5;
            if (s.charAt(i) == 'X') convertedNumber += 10;
            if (s.charAt(i) == 'L') convertedNumber += 50;
            if (s.charAt(i) == 'C') convertedNumber += 100;
            if (s.charAt(i) == 'D') convertedNumber += 500;
            if (s.charAt(i) == 'M') convertedNumber += 1000;
*/
        }

        return convertedNumber;
    }

    public int _convert(String s) {

        int convertedNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;

            if (currentNumber >= next) {
                convertedNumber += currentNumber;
            } else {
                convertedNumber -= currentNumber;
            }
        }

        return convertedNumber;
    }
}
