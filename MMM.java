import java.util.Arrays;

public class MMM 
{
    public static void main(String[] args) 
     {
        int[] array = {16, 18, 27, 16, 23, 21, 19};

        // Calculate Mean
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];        
        }
        double mean = (double) sum / array.length;
        System.out.println("Mean = " + mean);

        // Calculate Median
        Arrays.sort(array);
        int middleIndex = array.length / 2;
        double median = array[middleIndex];
        System.out.println("Median = " + median);

        // Calculate Mode
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                {                    
                  count++;
                }
            }
            if (count > maxCount) 
            {
                maxCount = count;
                mode = array[i];
            }
        }
        System.out.println("Mode = " + mode);
    }
}