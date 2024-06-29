import java.util.*;
class PalindromeString
{
  public static void main(String arg[])
  {
    String s1="temple";
    String rev=" ";
    char ch;
    int n=s1.length();
    for(int i=n-1;i>=0;i--)
    {
      ch=s1.charAt(i);
      rev=rev+ch;
    }
    if(rev.equals(s1))
    {
    System.out.println(s1+"is palindrome");
    }
    else
    {
    System.out.println(s1+"is not palindrome");
    }
  }
}