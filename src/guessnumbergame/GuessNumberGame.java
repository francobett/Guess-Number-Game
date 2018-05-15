package guessnumbergame;

import java.util.Scanner;

/**
 *
 * @author Franco Betetto
 */
public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while( true ){
            System.out.println("Hi!, Welcome to the funniest game 'Guess Number': \n");
            System.out.println("-Type 'me', if you want to guess a number. \n-Type 'exit' if you want to exit \n-Otherwise, I will guess a number ;) \n");
            String option = sc.nextLine();
            
            switch (option){
                case "me":
                    Evaluator evaluator = new Evaluator();
                    evaluator.evaluating();
                    break;
                case "exit":
                    return;                
                default: 
                    System.out.println("OK!, think your number  \n Remember to press + if your number is bigger , - if is smaller or = if is equal");
                    Guesser guesser = new Guesser();
                    guesser.guessing();
                    break;
            }
        }    
    }
   
}
