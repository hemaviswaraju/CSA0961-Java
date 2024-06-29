class Pattern10
{
    public static void main(String[] arg) 
    {
     int i,j,n=5;
     for(i=1;i<=5;i++)
      {
       for(j=5;j>=i;j--)
       {
        System.out.print(" ");
       }
        for(j=1;j<=2*i-1;j++)
         {
          System.out.print(i);
         }
          System.out.println();
      }
     }
}