class Pattern14
 {
    public static void main(String[] arg) {
        int i, j;
        for(i = 1; i <= 4; i++) 
        {
          for(j = 1; j <= i; j++)
           {
                System.out.print("1");
            }
            System.out.println();
        }
        
        for(i = 3; i >= 1; i--) 
        {
            for(j = 1; j <= i; j++) 
        {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}