package org.example;

public class linearSearch {
    public static void main(String[] args) {
        int nums[] = {3,4,6,7,8};
        int target = 3;
        int result = binarySearch(nums,target);
        if(result != -1) {
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int linearsearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int nums[], int target) {
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid]< target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}
