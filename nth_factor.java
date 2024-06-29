import java.util.Scanner;

public class nth_factor 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int num = scanner.nextInt();
        System.out.print("N = ");
        int n = scanner.nextInt();

        int count = 0;
        int[] factors = new int[num];
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0) 
            {
                factors[count] = i;
                count++;
            }
        }

        System.out.println("Number of factors = " + count);

        if (n <= count) 
        {
            System.out.println(n + "th factor of " + num + " = " + factors[n - 1]);
        } 
          else 
        {
            System.out.println("N is greater than the number of factors");
        }
    }
}