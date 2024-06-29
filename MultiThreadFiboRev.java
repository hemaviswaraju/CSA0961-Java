class Fibonacci extends Thread
{
 public void run()
 {
  int n1=0,n2=1;
  System.out.println("Fibonacci series:");
  for(int i=0;i<10;i++)
  {
    System.out.println(n1+" ");
    int sum=n1 + n2;
    n1 =n2;
    n2=sum;
  }
  System.out.println();
 }
}
class Reverse extends Thread
{
  public void run()
  {
    int num=1234;
    int rev=0;
    while(num!=0)
    {
      int rem=num%10;
      rev=rev*10+rem;
      num=num/10;
    }
     System.out.println("Reverse number: " + rev);
   }
}
class MultiThreadFiboRev
{
  public static void main(String args[])
  {
   Fibonacci obj1=new Fibonacci();
   Reverse obj2=new Reverse();
   obj1.start();
   obj2.start();
  }
}
   