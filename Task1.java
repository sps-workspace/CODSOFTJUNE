import java.util.Scanner;

public class Task1 {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_GUESSES = 10;

    private int number;
    private int guesses;

    public Task1() {
        this.number = generateRandomNumber();
        this.guesses = 0;
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
    }



    public void play() {
        while (guesses < MAX_GUESSES) {
            int guess = getGuess();

            if (guess == number) {
                System.out.println("Congratulations! You guessed the number correctly in " + guesses + " guesses.");
                break;
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }

            guesses++;
        }

        if (guesses == MAX_GUESSES) {
            System.out.println("You have run out of guesses. The number was " + number);
        }
    }

    private int getGuess() {
        System.out.print("Enter your guess: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        return guess;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.play();
    }
}