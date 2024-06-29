class perfectnumber 
  {
    public static void main(String[] args)
     {
        int n = 8, i, fact = 1;
        for (i = 1; i < 6; i++) 
         {
            if (n % i == 0) 
            {
                fact *= i;
            }
        }

        if (fact == n) 
          {
            System.out.println("Perfect number");
        } 
         else 
        {
            System.out.println("Not a perfect number");
        }
    }

}