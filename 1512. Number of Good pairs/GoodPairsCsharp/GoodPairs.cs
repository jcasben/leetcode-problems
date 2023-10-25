namespace GoodPairsCsharp;

public class GoodPairs
{
    public static void Main(string[] args)
    {
        var nums = new [] {1,2,3};
        Console.WriteLine(NumIdenticalPairs(nums));
    }

    private static int NumIdenticalPairs(int [] nums)
    {
        var pairs = 0;
        int i = 0, j = 0;

        while (i < nums.Length)
        {
            if (i < j && nums[i] == nums[j]) pairs++;
            j++;
            if (j != nums.Length) continue;
            i++;
            j = 0;
        }

        return pairs;
    }
}