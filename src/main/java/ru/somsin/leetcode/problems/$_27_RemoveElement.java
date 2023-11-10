package ru.somsin.leetcode.problems;

public class $_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left++] = nums[i];
            }
        }

        return left;
    }
}
