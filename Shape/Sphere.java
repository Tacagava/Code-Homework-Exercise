package Shape;

public class Sphere extends Shape {
    private double radio;

    public Sphere (double r){
        this.radio = r;
    }
    @Override
    public double getVolume(){
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }

}
