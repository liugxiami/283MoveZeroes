package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int[] arr={0,1,0,3,12};
        moveZeroes(arr);
    }
    //Given an array nums,write a function to move all 0's to the end of it while maintaining the
    //relative order of the non-zero elements.
    public static void moveZeroes(int[] nums){
        if(nums==null||nums.length==0) return;
        int slow=0;           //快慢指针，直接覆盖，快指针找到非0值，覆盖到慢指针
        int fast=-1;
        while(++fast<nums.length){
            if(nums[fast]==0) continue;
            nums[slow]=nums[fast];
            slow++;
        }
        while(slow<nums.length){
            nums[slow]=0;
            slow++;
        }
    }

}
