package ru.somsin.leetcode.problems;

public class $_239_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int windows = nums.length - k + 1;
        int[] result = new int[windows];

        for (int window = 0; window < windows; window++) {
            int max = nums[window];

            for (int index = window + 1; index < window + k; index++) {
                max = Math.max(max, nums[index]);
            }

            result[window] = max;
        }

        return result;
    }
}
