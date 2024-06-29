class A extends Thread
{
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
      System.out.println("9"+"*"+i+ "=" +(9*i));
    }
  }
}
class B extends Thread
{
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
      System.out.println("11"+"*"+i+ "=" +(11*i));
    }
  }
}
class ThreadTable
{
 public static void main(String args[])
 {
   A obj1=new A();
   B obj2=new B();
   obj1.start();
   obj2.start();
 }
}

 