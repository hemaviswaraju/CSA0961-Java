class Pattern7
{
    public static void main(String[] arg) 
    {
     int i,j,k,n=5;
     for(i=1;i<=n;i++)
      {
       for(k=1;k<=i;k++)
       {
       System.out.print(" ");
       }
       for(j=1;j<=n-i+1;j++)
       {
        System.out.print(i);
       }
       System.out.println( );
      }
       }
     
}