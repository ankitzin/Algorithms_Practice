package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main cla = new Main();
		int[] nums = {2,11,7,15};
		int target = 26;
		int[] solution = new int[7];
		solution =cla.twoSum(nums, target);
		for(int i=0;i<solution.length;i++){
			System.out.println(solution[i]);
		}
		
	}
	public int[] twoSum(int[] nums, int target){
		int[] arr = new int[2];
		Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			
			Integer val = map.get(target - nums[i]);
			if(val == null){
				map.put(nums[i], i);
			}else {
				arr[0]=val;
				arr[1]=i;
				break;
			}
		}
		return arr;
	}
}
