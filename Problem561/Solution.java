/**
 * @author tgorthi
 * @since Jun 2020
 */

import java.util.Arrays;

public class Solution
{
    public int arrayPairSum(int[] nums)
    {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0)
            {
                sum += nums[i];
            }
        }
        return sum;
    }
}