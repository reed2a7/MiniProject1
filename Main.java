import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the guessing game");
    System.out.println("Please enter any positive whole number:");
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);
    System.out.println("A random number to guess has been generated");
    playGame(randomNum, userNum);
    }

  static void playGame(int guessNum, int orgNum) {
    System.out.println("Please guess a number between 0 and "+orgNum); 
    Scanner s2 = new Scanner(System.in);
    int userGuess = s2.nextInt();
    int numTries = 1; 
  while(userGuess != guessNum) {
    if(userGuess < guessNum) {
    System.out.println("Guess higher!:");
    userGuess = s2.nextInt();
    }
    else if(userGuess > guessNum) {
      System.out.println("Guess lower!:");
    userGuess = s2.nextInt();
    }
    ++numTries;
  }
  System.out.println("Great, you win! It took you "+numTries+" tries");
    }
   // int randomInt = r.nextInt(5);
    
    //num = s.nextInt();
    }