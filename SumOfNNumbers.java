import java.util.Scanner;
class SumOfNNumbers 
{
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n]; 
        for (int i = 0; i < n; i++) 
        {
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum += numbers[i]; 
        }
        System.out.println(sum);
    }
}