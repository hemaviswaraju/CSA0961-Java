import java.util.*;
class swap
{
  public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int a,b,temp;
      System.out.println("enter a");
      a=sc.nextInt();
      System.out.println("enter b");
      b=sc.nextInt();
      temp=a;
      a=b;
      b=temp;
      System.out.println("after swapping:"+a);
      System.out.println("after swapping:"+b);
    } 
}