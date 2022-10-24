package Questions;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args){
        Integer max = 50;
        Integer min = 1;
        Integer range = max - min + 1;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
            numbers.add(rand);    
        }  
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(numbers);
        numbers.set(9, -5);
        System.out.println("Original ArrayList = " + numbers);
        System.out.println("Duplicate Arraylist:" + numbers2);
    }
}
