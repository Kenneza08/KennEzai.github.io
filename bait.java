import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("(====Welcome to Jack and Poy Game====)");
        
        System.out.println(" 1:Rock!");
        System.out.println(" 2:Paper!");
        System.out.println(" 3:Scissors!");
        
 
        
        int userChoice = scanner.nextInt();
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            return;
        }
        
        int computerChoice = random.nextInt(3);
        
        
        if (userChoice == 0) {
            System.out.println("You chose: Rock");
        } else if (userChoice == 1) {
            System.out.println("You chose: Paper");
        } else {
            System.out.println("You chose: Scissors");
        }
        
        if (computerChoice == 0) {
            System.out.println("Computer chose: Rock");
        } else if (computerChoice == 1) {
            System.out.println("Computer chose: Paper");
        } else {
            System.out.println("Computer chose: Scissors");
        }
        
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2) || 
                   (userChoice == 1 && computerChoice == 0) || 
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
    
    public static void main(String[] args) {
        playGame();
    }
}