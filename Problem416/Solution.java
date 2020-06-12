/**
 * @author tgorthi
 * @since Jun 2020
 */
public class Solution
{
    public boolean canPartition(int[] nums)
    {
        int sum = 0;
        for (int num : nums)
        {
            sum += num;
        }
        if (sum % 2 != 0)
        {
            return false;
        }
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int i = 1; i <= nums.length; i++)
        {
            for (int j = sum; j >= nums[i - 1]; j--)
            {
                dp[j] = dp[j] || dp[j - nums[i - 1]];
            }
        }
        return dp[sum];
    }
}