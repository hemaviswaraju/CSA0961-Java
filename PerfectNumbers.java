public class PerfectNumbers
{
    public static void main(String[] args)
    {
        int n = 4;  // Number of perfect numbers to find
        int count = 0;  // Count of perfect numbers found
        int number = 1;  // Current number to check

        System.out.println("The first " + n + " perfect numbers are:");

        while (count < n) 
        {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) 
            {
                if (number % i == 0) 
                {
                    sum += i;
                }
            }

            if (sum == number && number != 0) 
            {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
