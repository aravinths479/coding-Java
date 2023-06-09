// Given an integer array nums, return true if any value appears at least twice in the array, 
// and return false if every element is distinct.

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

import java.util.*;

public class containsDuplicate {
    public static boolean check(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(check(nums));
    }
}
