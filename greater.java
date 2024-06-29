import java.util.*;
class Greater
{
  public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int n1,n2;
      System.out.println("enter n1");
      n1=sc.nextInt();
      System.out.println("enter n2");
      n2=sc.nextInt();
      if(n1>n2)
      System.out.println("n1 is greater");
      else
      System.out.println("n2 is greater");
    } 
}