import java.util.*;
class Convert
{
  public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      double c,f;
      System.out.println("enter c");
      c=sc.nextDouble();
      f=(1.8*c)+32;
      System.out.println("celcius to farenheit:"+f);
    } 
}