package TwoPointers.ContainerWithMostWater;

public class ContainerWithMostWater {
    public static int solution(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int area = 0;
        int ans = 0;

        while(left < right){
            if(nums[left] < nums[right]){
                area = nums[left] * (right - left);
                left++;
            }else{
                area = nums[right] * (right - left);
                right--;
            }
            ans = Math.max(area, ans);   
        }
        return ans;

    }

    public static void main(String args[]){
        int[] arr = new int[]{1, 1, 6, 2, 5, 4, -8, 3, 2};
        System.out.println(solution(arr));
    }
}
