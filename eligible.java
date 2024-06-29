import java.util.*;
class Eligible
{
  public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter n");
      n=sc.nextInt();
      if(n>=18)
      System.out.println("you are eligible to vote");
      else
      System.out.println("you are eligible to vote after"+(18-n)+"years");
    } 
}