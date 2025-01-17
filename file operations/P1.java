import java.io.*;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        String inputFileName = "numbers.txt"; // File to read numbers from
        String outputFileName = "sum.txt"; // File to write the sum

        try {
            // Read numbers from the input file
            File inputFile = new File(inputFileName);
            Scanner fileReader = new Scanner(inputFile);

            int sum = 0;

            // Process each line to extract numbers
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                try {
                    // Parse each line as an integer
                    int number = Integer.parseInt(line.trim());
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + line);
                }
            }

            fileReader.close();

            // Write the sum to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write("The sum of numbers is: " + sum);
            writer.newLine();
            writer.close();

            System.out.println("Sum calculated and written to " + outputFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
