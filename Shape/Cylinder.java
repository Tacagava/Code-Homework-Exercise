package Shape;

public class Cylinder extends Shape {
    private double radio;
    private double height;

    public Cylinder(double r, double h){
        this.radio = r;
        this.height = h;

    }
    public double getRadio() {
        return radio;
    }

    @Override
    public double getVolume(){
        return Math.PI * Math.pow(radio,2) * this.height;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    }

