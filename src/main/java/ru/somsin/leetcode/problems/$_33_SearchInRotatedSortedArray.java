package ru.somsin.leetcode.problems;

public class $_33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int length = nums.length;

        int left = 0, right = length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return nums[left - 1] == target ? left : -1;
    }
}
