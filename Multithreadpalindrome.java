class A extends Thread
{
  public void run()
  {
   String str="malayalam";
   String rev="";
   char ch;
   int n=str.length();
   for(int i=n-1;i>=0;i--)
   {
    ch=str.charAt(i);
    rev=rev+ch;
   }
   if(rev.equals(str))
   {
     System.out.println(str+ "it is palindrome");
   }
   else
   { 
     System.out.println(str+ " it is not palindrome");
    }
  }
}
class B extends Thread
{
public void run()
{
 int n=12321,rev=0,sum=0,a;
        sum=n;
        while(n>0)
        {
        a=n%10;
        rev=rev*10+a;
        n=n/10;
        }
        if(sum==rev)
        {
        System.out.print("is a palindrome\n"+sum);
        }
        else
        {
        System.out.print("is not a palindrome\n"+sum);
        }
}
}
class Palinnumstr
{
public static void main(String arg[])
{
A obj1=new A();
B obj2=new B();
obj1.start();
obj2.start();
}
}