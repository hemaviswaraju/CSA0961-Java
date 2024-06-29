public class uniquecharacters  
{
    public static void main(String[] args) 
    {
        String str = "abcb";
        int count;

        for (int i = 0; i < str.length(); i++) 
	{
            count = 0;
            for (int j = 0; j < str.length(); j++)
	    {
                if (str.charAt(i) == str.charAt(j)) 
                {
                    count++;
                }
            }
            if (count == 1)
            {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}