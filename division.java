import java.util.*;
class Division
{
   public static void main(String arg[])
     {
       Scanner sc=new Scanner(System.in);
       int dividend,divisor;
       double quotient,remainder;
       System.out.println("enter dividend");
       dividend=sc.nextInt();
       System.out.println("enter divisor");
       divisor=sc.nextInt();
       quotient=dividend/divisor;
       remainder=dividend%divisor;
       System.out.println("quotient="+quotient);
       System.out.println("remainder="+remainder);
    }
}