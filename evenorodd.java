import java.util.*;
class Oddoreven
{
  public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter n");
      n=sc.nextInt();
      if(n%2==0)
      System.out.println("n is even");
      else
      System.out.println("n is odd");
    } 
}