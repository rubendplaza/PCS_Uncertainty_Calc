import java.util.*;
import java.math.*;

public class UncertaintyCalculation {
    public static void main (String [] args){

        int numOfValues;
        double mew;
        double sigma;

        Scanner input = new Scanner(System.in);

        System.out.print("How many data values do you have?");
        numOfValues = input.nextInt();

        double[] arrayOfValues = new double[numOfValues];

        for(int x=0; x<numOfValues; x++){

            System.out.println("Enter a data value: ");
            arrayOfValues[x] = input.nextDouble();

        }

        double sum = 0;

        for (int x=0; x<numOfValues; x++){

            sum += arrayOfValues[x];

        }

        mew = sum/numOfValues;

        double underSquareRoot = 0;

        for(int x=0; x<numOfValues; x++){

            underSquareRoot += Math.abs(mew - arrayOfValues[x]);

        }

        sigma = Math.sqrt(underSquareRoot);

        System.out.println("The average of the values is: " + mew);
        System.out.println("The uncertainty of the values is: " + sigma);

    }
}
