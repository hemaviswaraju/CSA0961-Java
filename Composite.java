import java.util.*; 
class composite
{
static boolean iscom(int n)
{
	if (n == 1 || n == 0)
		return false;
	for (int i = 2; i < n; i++) 
	{
		if (n % i == 0)
			return true;
	}
	return false;
}
    public static void main(String args[])
    {
	int A,B;
	System.out.println("The composite numbers between A and B");
	A = 12;
	B = 19;
	for (int i = A+1; i < B; i++) 
	{
		if (iscom(i))
	{
		System.out.println(i);
	}
	}
}
}