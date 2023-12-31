package ru.somsin.leetcode.problems;

public class $_168_ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber-- > 0) {
            result.append((char) ((columnNumber) % 26 + 'A'));
            columnNumber = (columnNumber) / 26;
        }

        return result.reverse().toString();
    }
}
