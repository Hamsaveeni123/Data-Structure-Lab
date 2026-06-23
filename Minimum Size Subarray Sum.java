public class MinSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right=0; right<nums.length; right++) {
            sum += nums[right];

            while(sum >= target) {
                minLen = Math.min(minLen, right-left+1);
                sum -= nums[left++];
            }
        }

        System.out.println(minLen);
    }
}
