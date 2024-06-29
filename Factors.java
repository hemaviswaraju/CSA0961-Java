import java.util.*;
class Factors
{
    public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        int num,i;
        int count=0;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        System.out.println("the factors are:");
        for(i=1;i<=num;i++)
        { 
          if(num%i==0)
          { 
            count++;
          }
         System.out.println(i);
  
        }
      }
 }