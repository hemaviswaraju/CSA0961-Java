public class frequency
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int n = arr.length;
        System.out.println("Element  |  Frequency");
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == -1) 
            {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("  " + arr[i] + "  |  " + count);
        }
    }
}