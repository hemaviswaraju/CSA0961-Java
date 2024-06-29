import java.util.*;
class dtob
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int b=0;
    int c=0;
    while(N!=0)
    {
      b+=(N%2)*Math.pow(10,c);
      N/=2;
      c++;
    }
    System.out.println("Binary value:"+b);
  }
}