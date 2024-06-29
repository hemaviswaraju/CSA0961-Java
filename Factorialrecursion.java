class Factorialrecursion 
{
public static int factorial(int n) 
{
if (n <= 1) 
{
return 1;
}
return n * factorial(n - 1);
}
public static void main(String arg[]) 
{
int number = 5; 
int result = factorial(number);
System.out.println("The factorial of " + number + " is " + result);
}
}