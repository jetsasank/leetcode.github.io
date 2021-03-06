/**
 * @author tgorthi
 * @since Jun 2020
 */
public class Solution
{
    public int numDecodings(String s)
    {
        if (s == null || s.length() == 0 || s.charAt(0) == '0')
        {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 1;
        dp[n - 1] = s.charAt(n - 1) == '0' ? 0 : 1;
        for (int i = n - 2; i >= 0; i--)
        {
            if (s.charAt(i) == '0')
            {
                continue;
            }
            dp[i] = ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0')) <= 26 ? dp[i + 1] + dp[i + 2] : dp[i + 1];
        }
        return dp[0];
    }
}