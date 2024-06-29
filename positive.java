import java.util.*;
class positive
{
  public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter n");
      n=sc.nextInt();
      if(n>0)
      System.out.println("positive");
      else if(n<0)
      System.out.println("negative");
      else
      System.out.println("zero");
    } 
}