package assignment.internshala.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    Solution solution = new Solution();
	    int[] array = {3,3};
	    int[] ans = solution.twoSum(array, 6);
	    for (int number : ans) {
		    System.out.println(number);
	    }
    }
}

class Solution {
	int[] output = new int[2];
	public int[] twoSum(int[] nums , int target) {

		for (int i =0 ; i < nums.length ; i++) {
			for (int j = i +1 ; j < nums.length ; j ++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					break;
				}
			}
		}

		return output;
	}
}
