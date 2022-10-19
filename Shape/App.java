package Shape;

public class App{

    public static void main (String[] args) throws Exception{
        Cylinder c1 = new Cylinder(2, 5);
        Sphere s1 = new Sphere(2);
        double s1Sphere = s1.getVolume();
        double c1Cylinder = c1.getVolume();
        System.out.println("The Volume of Sphere S1 is :" + s1Sphere);

        System.out.println("The Volume of Cylinder C1 is :" + c1Cylinder);
    } 
}

    
