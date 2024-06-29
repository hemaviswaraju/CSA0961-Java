import java.util.*;
class sumofdigits
{
    public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        int num,rev=0,rem,remm,sum=0;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        while(num!=0)
        {
          rem=num%10;     
          rev=rev+rem;
          num=num/10;
        }
        if(rev>=10)
        {
          while(rev!=0)
          {
           remm=rev%10;
           sum=sum+remm;
           rev=rev/10;
          }
           System.out.println("sum of digits"+sum);
        }
        else
        {
          System.out.println("sum of digits"+rev);
       }
       }
}    