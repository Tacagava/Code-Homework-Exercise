package GuessGame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {
        ArrayList <String> words = new ArrayList<>();
        words.add("Welcome");
        words.add("Olympics");
        words.add("Offense");
        words.add("Sound");
        words.add("Anesthesia");
        words.add("Evening");
        words.add("Music");
        words.add("Mutiny");
        words.add("Family");

        // We are finding random index by using get Random Method
        // Also get Random takes a parameter called as max, which is the length of the array - 1

        int randomIndex = getRandom(words.size() - 1);
        // This one finds the random String because we are giving random Index
        String randomWord = words.get(randomIndex);
        String clues = "";

        for (int i = 0; i < randomWord.length(); i++){
            clues+="_";
        }

        System.out.println("***~~~~~Welcome~~~~~***");
        System.out.println("|Enter *star* to star the game|");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();

        try{
            if (option != ""){
                System.out.println("~~This is your word to guess~~");
                System.out.println(clues);
                String letraAAdivinar = "";
                System.out.println("Please enter a letter");
                while(letraAAdivinar.isEmpty()) {

                    String letra = sc.nextLine();

                    if (randomWord.compareTo(letra) == 0){ 
                        System.out.println("***Congratulations you guessed the word!***");
                        letraAAdivinar+=letra;
                        System.out.println(">>>Do you want to add a word to the game?<<<");
                        System.out.println("if you want, press 1 otherwise press 2:");
                        int respuesta = sc.nextInt();
                        if (respuesta == 1){
                            System.out.println("---Enter the word---");
                            String palabra = sc.next();
                            words.add(palabra);
                            System.out.println("Your word has been added thank you very much for your cooperation :)");
                        }else {
                            System.out.println("Okay, I get it :c");
                            break;
                        }
                    }
 
                    else if (randomWord.indexOf(letra) != -1){
                        int CuantasVecesAparece = contadorDeLetra(randomWord, letra);
                        System.out.println("The letter appears: " + CuantasVecesAparece + " times in the word");
                        System.out.println("Please enter a other letter or the word");
                    }else{
                        System.out.println("Your letter is not found in the word, enter another one again.");   
                    }



                }     
                
            }   
            
        }catch (InputMismatchException e){
            System.out.println("Please enter a letter :)");
        }catch (Exception e){
            System.out.println("Something went wrong please try again :(");
        }finally{
            System.out.println("Thanks for playing <3");
            sc.close();
        }
    }   
    // Takes a parameter and it generates a random number from 0 - max
    public static int getRandom(int max) {
         return (int) (Math.random()*max); 
    }
//This function counts how many times the letter appears in the word and returns how many times it appeared.
    public static int contadorDeLetra(String word,String letra){
        int contador = 0;
        int posicion = word.indexOf(letra);
        while (posicion != -1){
            contador++;
            posicion = word.indexOf(letra,posicion +1);
        } 
        return contador;
    }
}

