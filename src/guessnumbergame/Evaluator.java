package guessnumbergame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Franco Betetto
 */

/*
* Esta clase genera un n° aleatorio y evalua los inputs del usuario hasta que
* el mismo acierte el n° generado de forma aleatoria.
*/
public class Evaluator {
    
    private int numberToGuess; // Propiedad del n° a adivinar
    private final int max = 100; // Rango máximo para el n° a adivinar
    private final int min = 1; // Rango mínimo para el n° a adivinar
    
    // Constructor
    public Evaluator(){ 
        this.generateRandomNumber(); // Llamar método para generar n° aleatorio
    }
    
    // Generar n° entre 1 y 100
    private void generateRandomNumber(){
        this.numberToGuess = new Random().nextInt(max - min) + min; 
   
    }
    
    // Método que va analizando las entradas del usuario para ver si adivinó el número generado o no
    public void evaluating(){ 
        Scanner sc = new Scanner(System.in); // Scanner para los inputs del usuario
       
        int expectedNumber = 0 ; // Crear variable expectedNumber (variable que guardará el n° ingresado por el usuario)
        
        while( true ){ // Mientras no adivine
            
            try {
                System.out.println("Enter a number between 1 and 100");
                expectedNumber = sc.nextInt(); // Guarda el n° ingresado en 'expectedNumber'
                // Si el n° ingresado es el mismo que el generado anteriormente:
                if ( expectedNumber == this.numberToGuess) {
                    System.out.println("You guess the number:"+this.numberToGuess+" ¡Congratulations! \n");
                    return; // Termina la ejecución del método

                }

                // Si el n° ingresado es menor que el generado anteriormente:
                if ( expectedNumber > this.numberToGuess){
                    System.out.println("My number is smaller \n");

                }else{ // Si el n° ingresado es mayor que el generado anteriormente:
                    System.out.println("My number is bigger \n");
                }
            }catch(Exception e) { //Si ocurre algún error termina el bucle
                System.out.println("Something went wrong, retry");
                break;
                
            }
            
            
            
        }

    }
    

}
