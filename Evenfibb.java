import java.util.Scanner;

class Evenfibb 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sumEven = 0;

        for (int i = 0; i <= n*2; i++) 
        {
            if (i % 2 == 0) 
            {
                sumEven += a;
            }
            int c=a+b;
            a = b;
            b = c;
             System.out.println(i);
        }

        System.out.println("Sum " + n + " is: " + sumEven);
    }
}