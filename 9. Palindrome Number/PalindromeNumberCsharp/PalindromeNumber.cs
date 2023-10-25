namespace PalindromeNumberCsharp;

public class PalindromeNumber
{
    public static void Main(string[] args)
    {
        Console.WriteLine(isPalindrome(121));
    }

    private static bool isPalindrome(int x)
    {
        var isPalindrome = true;
        var a = x.ToString();
        int i = 0, j = a.Length - 1;

        while (i < j)
        {
            if (a[i] != a[j])
            {
                isPalindrome = false;
                break;
            }
            
            if ((a.Length % 2 == 1 && i == j - 2) || a.Length % 2 == 0 && i == j - 1) isPalindrome = true;
            
            i++;
            j--;
        }

        return isPalindrome;
    }
}

