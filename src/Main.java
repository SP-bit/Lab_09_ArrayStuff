import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] dataPoints;
        dataPoints = new int[100];
        Random rnd = new Random();
        for(int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for(int x = 0; x < dataPoints.length; x++)
        {
            System.out.print(dataPoints[x] + " | ");
        }
        double sum = 0;
        for(int x = 0; x < dataPoints.length; x++)
        {
            sum = sum + dataPoints[x];
        }
        double avg = sum / dataPoints.length;
        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints: " + avg);
        int userInput = SafeInput.getRangedInt(in,"Enter an integer from 1 - 100", 1, 100);
        boolean foundTarget = false;
        for(int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == userInput)
            {
                foundTarget = true;
                System.out.println("Found your value (" + userInput + ") at index: " + x);
            }

        }
        if(!foundTarget)
        {
            System.out.println("Target " + userInput + " not found");
        }
        int userInput2 = SafeInput.getRangedInt(in,"Enter another integer from 1 - 100", 1, 100);
        for(int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == userInput2)
            {
                foundTarget = true;
                System.out.println("(Break) Found your value (" + userInput + ") at index: " + x);
                break;
            }

        }
        if(!foundTarget)
        {
            System.out.println("Target " + userInput + " not found");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(min > dataPoints[x])
            {
                min = dataPoints[x];
            }
            if (max < dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        int sum = 0;
        for(int x = 0; x < values.length; x++)
        {
            sum = sum + values[x];
        }
        double avg = (double) sum / values.length;
        return avg;
    }
}
