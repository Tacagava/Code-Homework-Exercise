package Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Integer max = 50;
        Integer min = 1;
        Integer range = max - min + 1;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
            numbers.add(rand);    
        }  
        System.out.println(numbers);
        Scanner selectedNumber = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int chosenNumber = selectedNumber.nextInt();
        selectedNumber.close(); 
        if (numbers.indexOf(chosenNumber) != -1){
            System.out.println("Your number is in the Arraylist :) ");
        }else {
            System.out.println("Your number is not in the Arraylist :( ");
        }
    }
}