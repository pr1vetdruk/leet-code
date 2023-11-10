package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (char key : sMap.keySet()) {
            if (!sMap.get(key).equals(tMap.get(key))) {
                return false;
            }
        }

        return true;
    }
}
