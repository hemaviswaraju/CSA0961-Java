import java.util.*;
class Herons
{
  public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int s,a,b,c,A;
      System.out.println("enter a");
      a=sc.nextInt();
      System.out.println("enter b");
      b=sc.nextInt();
      System.out.println("enter c");
      c=sc.nextInt();
      System.out.println("enter s");
      s=sc.nextInt();
      A=(s*(s-a)*(s-b)*(s-c));
      System.out.println(Math.sqrt(A));
    } 
}