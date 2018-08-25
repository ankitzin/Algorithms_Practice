package ContainerWithMost;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr={10,15,25,16};
		int result = sol.maxArea(arr);
		System.out.println(result);
	}
	
	public int maxArea(int[] height){
		int area=0;
		int left = 0,right=height.length-1;
		while(left<right){
			area=Math.max(area,Math.min(height[left], height[right])*(right-left));
			if(height[left]<height[right]){
				left++;
			}else{
				right--;
			}
		}
		return area;
	}

}
