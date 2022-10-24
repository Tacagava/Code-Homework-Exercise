package Questions;

import java.util.ArrayList;
import java.util.Arrays;


public class Q3 {

    private String makeOfcars;
    private String modelOfcars;
    private int yearOfcars;

    public String getMakeOfcars() {
        return makeOfcars;
    }
    public void setMakeOfcars(String makeOfcars) {
        this.makeOfcars = makeOfcars;
    }
    public String getModelOfcars() {
        return modelOfcars;
    }
    public void setModelOfcars(String modelOfcars) {
        this.modelOfcars = modelOfcars;
    }
    public int getYearOfcars() {
        return yearOfcars;
    }
    public void setYearOfcars(int yearOfcars) {
        this.yearOfcars = yearOfcars;
    }
   
    public Q3(String makeOfcars,String modelOfcars,int yearOfcars){
            this.makeOfcars = makeOfcars;
            this.modelOfcars = modelOfcars;
            this.yearOfcars = yearOfcars;
    }

    ArrayList <Object> Car = new ArrayList<>(Arrays.asList(makeOfcars,modelOfcars,yearOfcars));
           
}
