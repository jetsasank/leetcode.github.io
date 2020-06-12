/**
 * @author tgorthi
 * @since Jun 2020
 */
public class Solution
{
    public boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        for (int i = 0; i < flowerbed.length && n > 0; i++)
        {
            if (flowerbed[i] == 0 && (i == 0 ? true : flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 ? true :
                    flowerbed[i + 1] == 0))
            {
                n--;
                flowerbed[i] = 1;
            }
        }
        return n == 0;
    }
}