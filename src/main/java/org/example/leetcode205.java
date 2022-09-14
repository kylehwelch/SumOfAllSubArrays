package org.example;

import java.util.HashMap;
import java.util.Map;

class leetcode205 {
    public boolean isIsomorphic(String s, String t) {

        Map sMap = new HashMap();
        Map tMap = new HashMap();
        int sCount = 0;
        int tCount = 0;
        boolean added;

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            added = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    sMap.put(i, sCount);
                    added = true;
                    break;
                }
            }
            if (added == false) {
                sCount++;
                sMap.put(i, sCount);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            added = false;
            for (int j = 0; j < i; j++) {
                if (t.charAt(i) == t.charAt(j)) {
                    tMap.put(i, tCount);
                    added = true;
                    break;
                }
            }
            if (added == false) {
                tCount++;
                tMap.put(i, tCount);
            }
        }

        if (sMap.equals(tMap)) {return true;}
        else return false;
    }
};