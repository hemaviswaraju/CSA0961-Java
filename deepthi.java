import java.util.*;
class deepthi
{
 public static void main(String args[])
 {
  int n=12345;
  int rev=0;
  while(n!=0)
  {
   int rem=n%10;
   rev=(rev*10)+rem;
   int num=n/10;
  }
  System.out.println("the reversed number="+rev);
 }
}