package org.example;

public class linearSearch {
    public static void main(String[] args) {
        int nums[] = {3,4,6,7,8};
        int target = 77;
        int result = linearsearch(nums,target);
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
}
