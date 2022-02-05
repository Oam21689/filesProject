package filesproject;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 *
 * @author olamemuliri
 */

/*
*   Create a new Project named "FilesProject"
*   Create a file named "calculations.txt"
*   Write 1000 randomly generated integer numbers ranging from 0 - 1000
*   Read the file
*   Print the average of the numbers up to two decimal digits
*/
public class FilesProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Create a file named "calculations.txt"
        PrintWriter out = new PrintWriter("calculation.txt");
        Random rand = new Random();
        float sum = 0;
        float average = 0;
        int count = 0;
        //Write 1000 randomly generated integer numbers ranging from 0 - 1000
        for(int i=0;i<1000;i++)
            out.println(rand.nextInt(1001));
        out.close();
        //Read the file
        File inputFile = new File("calculation.txt");
        Scanner in = new Scanner(inputFile);
        while(in.hasNextInt())
        {
            System.out.println(in.nextInt());
            sum += in.nextInt();
            count++;
        }
        in.close();
        average = sum / count;
        //Print the average of the numbers up to two decimal digits
        System.out.printf("The average of the 1000 numbers generated is: %.2f\n",average);
        
    }
    
}
