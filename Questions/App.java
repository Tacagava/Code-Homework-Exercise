package Questions;
import javax.smartcardio.Card;

//import java.util.ArrayList;
//import java.util.Arrays;
import Questions.Q3;

public class App{
    public static void main(String[] args){   
        Q3 ferrari = new Q3("Ferrari", "Gama", 1990);
        Q3 buggati = new Q3("Buggati", "Veyron", 2005);
        Q3 bmw = new Q3("BMW", "X3", 2003);
        Q3 toyota = new Q3("TOYOTA", "RAV4", 2021);
        Q3 ford = new Q3("Ford", "Mustang", 1964);
        System.out.println(ferrari.getMakeOfcars());
        //ArrayList <Object> Car = new ArrayList<>(Arrays.asList(makeOfcars,modelOfcars,yearOfcars));

    }  
                               
}
