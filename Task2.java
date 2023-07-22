import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a text.
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Split the text into an array of words using space or punctuation as delimiters.
        String[] words = text.split("\\W+");

        // Initialize a counter variable to keep track of the number of words.
        int wordCount = 0;

        // Iterate through the array of words and increment the counter for each word encountered.
        for (String word : words) {
            wordCount++;
        }

        // Print the number of words to the user.
        System.out.println("The number of words in the text is: " + wordCount);
    }
}