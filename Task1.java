import java.util.Scanner;

class Game {
    int random;
    int guess;
    int numGuesses;

    public Game() {
        random = 45;
        numGuesses = 0;
    }

    public void takeInputs() {
        System.out.println("Guess the number\n");
        Scanner sc = new Scanner(System.in);
        guess = sc.nextInt();
        numGuesses++;
    }

    public void check() {
        while (numGuesses < 20) {
            if (guess > random) {
                System.out.println("Oops!!\nThis is an incorrect guess. Choose a smaller number.");
            } else if (guess < random) {
                System.out.println("Oops!!\nThis is an incorrect guess. Choose a greater number.");
            } else {
                System.out.println("Congratulations!!\nYou have guessed the correct number.");
                return;
            }
            takeInputs();
        }
        System.out.println("Bad luck! You have exceeded 20 guesses. Please try again.");
    }
}

class Task1 {
    public static void main(String[] args) {
        Game Mitaly = new Game();
        Mitaly.takeInputs();
        Mitaly.check();

    }
}

