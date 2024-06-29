class fibonacci
{
  public static void main(String arg[])
    {
      int a=0,b=1,c,i;
      System.out.println(a);
      System.out.println(b);
      for(i=1;i<=4;i++)
      {
       c=a+b;
       
       a=b;
       b=c;
       System.out.println(c);
      }
    } 
}