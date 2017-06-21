package test;
import java.util.Map;
import java.util.HashMap;
public class test {
	public int[] twoSum(int[] nums,int target){
		Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement),i };
	        }
	        map.put(nums[i],i);
	    }
	    
		throw new IllegalArgumentException("no solution");
	}
	public static void main(String[] args){
		test t=new test();
		int[] arr={3,3,4};
		int target=6;
		int[] result=new int[2];
		result=t.twoSum(arr,target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
