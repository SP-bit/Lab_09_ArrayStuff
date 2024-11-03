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

    }
}