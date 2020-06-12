/**
 * @author tgorthi
 * @since Jun 2020
 */
public class Solution
{
    public String longestPalindrome(String s)
    {
        int start = 0, end = 0, longest = 0;
        for (int i = 0; i < s.length(); i++)
        {
            int len = Math.max(getPalindomeLen(s, i, i + 1), getPalindomeLen(s, i, i));
            if (len > longest)
            {
                longest = len;
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int getPalindomeLen(String s, int left, int right)
    {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right - left - 1;
    }
}