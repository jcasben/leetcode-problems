
namespace ValidPalindromeCsharp;

public class ValidPalindrome
{
    static void Main(string[] args)
    {
        Console.WriteLine(ValidPalindromeSolution("Race a car"));
    }

    private static bool ValidPalindromeSolution(string s)
    {
        s = s.ToLower().Trim();
        var isPalindrome = true;
        int i = 0, j = s.Length - 1;

        while (i < j)
        {
            var iChar = s[i];
            var iValid = char.IsLetterOrDigit(iChar);
            //If it isn't valid, increment i
            if (!iValid) i++;
            var jChar = s[j];
            var jValid = char.IsLetterOrDigit(jChar);
            //If it isn't valid, decrement j
            if (!jValid) j--;
            
            //If any of them are invalid, go to the next iteration
            if (!iValid || !jValid) continue;
            
            if (iChar != jChar)
            {
                isPalindrome = false;
                break;
            }
            if (i == j-1)
            {
                isPalindrome = true;
            }

            i++;
            j--;
        }

        return isPalindrome;
    }
}