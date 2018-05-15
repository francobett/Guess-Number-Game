package guessnumbergame;

import java.util.Scanner;

/**
 *
 * @author Franco Betetto
 */
/*
* Esta clase genera se encarga de adivinar el número que elige el usuario
*/
public class Guesser {
    
    private final int max = 100; // Rango máximo para el n° a adivinar
    private final int min = 1; // Rango mínimo para el n° a adivinar
    
    
    
    // Método que realiza cálculos a medida que el usuario va ingresando +,- para adivinar el número.
    public void guessing(){
        Scanner sc = new Scanner(System.in); // Scanner para los inputs del usuario
        
        int guessingNumber = ( (max - min) / 2 ) + 1; // Inicializar el n° que busca adivinar, en la mitad del max y min (o sea 50)
        int auxNumber; // Variable auxiliar para guardar el n° previo
        int previousGuessingNumber = 0; // N° previo que calculó el guessing
        
        String choise; // Variable para obtener los inputs del usuario

        // Mientras verdadero
        while(true){
            
            auxNumber = guessingNumber;
            System.out.println("Is it your number "+guessingNumber+ "?");
            choise = sc.nextLine();

            switch (choise){
                case "=": System.out.println("I win ! :)"); return; // Adivinó, terminar bucle
                case "+": 
                    
                    if( Math.abs( (guessingNumber - previousGuessingNumber)/2) != 0){ //Si la diferencia entre estos n° es mayor a 0
                        guessingNumber += Math.abs((guessingNumber - previousGuessingNumber)/2);
                    }else{ // Ir sumando de a 1 hasta adivinar
                        guessingNumber += 1;
                    }
                     
                    
                    break;
                case "-": 
                    
                    if( Math.abs( (guessingNumber - previousGuessingNumber)/2) != 0){ //Si la diferencia entre estos n° es mayor a 0
                        guessingNumber -= Math.abs((guessingNumber - previousGuessingNumber)/2);
                    }else{// Ir restando de a 1 hasta adivinar
                        guessingNumber -= 1;
                    }
                    break;
                default: System.out.println("Something went wrong, retry"); break;
            }
            previousGuessingNumber = auxNumber; // Guardar n° anterior
            
                
            
        }

        
        
    }
}
